package com.sigmobile.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    IEXCloudAPI iexCloudAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iexCloudAPI = App.getIEXCloudAPI();

        Button searchButton = findViewById(R.id.searchButton);
        Button IntradaySearchButton = findViewById(R.id.IntradaySearchButton);
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
                final EditText intradayEditText = findViewById(R.id.tickerEntry);
                final String userIntraday = intradayEditText.getText().toString().toUpperCase();
                getIntradayRequest(userIntraday);
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

    public void getIntradayRequest(String Symbol) {
        Call<Intraday> call = iexCloudAPI.getIntraday(Symbol);
        call.enqueue(new Callback<Intraday>() {
            @Override
            public void onResponse(Call<Intraday> call, Response<Intraday> response) {
                Log.e("RESP", "onResponse: " + response.body());
                String date = response.body().getDate();
                String minute = response.body().getMinute();
                float volume = response.body().getVolume();
                float notional = response.body().getNotional();

                final TextView dateOutput = findViewById(R.id.dateOutput);
                final TextView minuteOutput = findViewById(R.id.minuteOutput);
                final TextView volumeOutput = findViewById(R.id.volumeOutput);
                final TextView notionalOutput = findViewById(R.id.notionalOutput);

                dateOutput.setText("Date: " + date);
                minuteOutput.setText("Minute: " + minute);
                volumeOutput.setText("Volume: " + Float.toString(volume));
                notionalOutput.setText("Notional: " + Float.toString(notional));
            }

            @Override
            public void onFailure(Call<Intraday> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

}
