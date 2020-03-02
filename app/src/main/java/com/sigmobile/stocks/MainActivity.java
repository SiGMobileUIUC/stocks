package com.sigmobile.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.XYChart;
import org.w3c.dom.Text;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.Activity;
import android.graphics.*;
import android.os.Bundle;

import com.androidplot.util.PixelUtils;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYSeries;
import com.androidplot.xy.*;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.io.*;
import java.net.*;
import java.util.*;


public class MainActivity extends AppCompatActivity {
    IEXCloudAPI iexCloudAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iexCloudAPI = App.getIEXCloudAPI();

        Button searchButton = findViewById(R.id.searchButton);
        Button IntradaySearchButton = findViewById(R.id.IntradaySearch);
        Button plotButton = findViewById(R.id.drawPlot);
        XYPlot plot = (XYPlot) findViewById(R.id.plot);
        plot.setVisibility(View.INVISIBLE);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText tickerEditText = findViewById(R.id.tickerEntry);
                final String userTicker = tickerEditText.getText().toString().toUpperCase();
                getQuoteRequest(userTicker);
            }
        });
        IntradaySearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText intraDayEditText = findViewById(R.id.tickerEntry);
                final String userIntraday = intraDayEditText.getText().toString().toUpperCase();
                getIntradayRequest(userIntraday);
            }
        });
        plotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText plotEditText = findViewById(R.id.tickerEntry);
                final String userPlot = plotEditText.getText().toString().toUpperCase();
                getPlotRequest(userPlot);
            }
        });
    }



    public void getQuoteRequest(String userTicker) {
        Call<Quote> call = iexCloudAPI.getQuote(userTicker);
        call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                Log.e("RESP", "onResponse: " + response.body());
                String symbol = response.body().getSymbol();
                String companyName = response.body().getCompanyName();
                float latestPrice = response.body().getLatestPrice();
                float previousClose = response.body().getPreviousClose();

                final TextView symbolOutput = findViewById(R.id.symbolOutput);
                final TextView nameOutput = findViewById(R.id.nameOutput);
                final TextView currentPriceOutput = findViewById(R.id.currentPriceOutput);
                final TextView prevCloseOutput = findViewById(R.id.prevCloseOutput);
                Log.e("RESP", symbol);

                symbolOutput.setText("Ticker: " + symbol);
                nameOutput.setText("Name: " + companyName);
                currentPriceOutput.setText("Current Price: $" + Float.toString(latestPrice));
                prevCloseOutput.setText("Close Price: $" + Float.toString(previousClose));
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
    public void getPlotRequest(String Symbol) {
        Call<List<Intraday>> call = iexCloudAPI.getIntraday(Symbol);
        call.enqueue(new Callback<List<Intraday>>() {
            @Override
            public void onResponse(Call<List<Intraday>> call, Response<List<Intraday>> response) {
                XYPlot plot = (XYPlot) findViewById(R.id.plot);
                Number[] y = new Number[response.body().size()];
                for (int i = 0; i < response.body().size(); i++) {
                    //x[i] = i;
                    y[i] = response.body().get(i).getVolume();
                }
                XYSeries series = new SimpleXYSeries(Arrays.asList(y), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "volume series");
                LineAndPointFormatter format = new LineAndPointFormatter();
                plot.addSeries(series, format);
                plot.setVisibility(View.VISIBLE);
            }

            @Override
            public void onFailure(Call<List<Intraday>> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
    public void getIntradayRequest(String Symbol) {
        Call<List<Intraday>> call = iexCloudAPI.getIntraday(Symbol);
        call.enqueue(new Callback<List<Intraday>>() {
            @Override
            public void onResponse(Call<List<Intraday>> call, Response<List<Intraday>> response) {
                Log.e("RESP", "onResponse" + response.body());
                String date = response.body().get(1).getDate();
                String minute = response.body().get(1).getMinute();
                float volume = response.body().get(1).getVolume();
                float notional = response.body().get(1).getNotional();
                final TextView dateOutput = findViewById(R.id.dateOutput);
                final TextView minuteOutput = findViewById(R.id.minuteOutput);
                final TextView volumeOutput = findViewById(R.id.volumeOutput);
                final TextView notionalOutput = findViewById(R.id.notionalOutput);
                dateOutput.setText(String.format("Date: %s", date));
                minuteOutput.setText(String.format("Minute: %s", minute));
                volumeOutput.setText(String.format("Volume: %s", Float.toString(volume)));
                notionalOutput.setText(String.format("Notional: %s", Float.toString(notional)));
                //Number[] x = new Number[response.body().size()];

            }

            @Override
            public void onFailure(Call<List<Intraday>> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
}
