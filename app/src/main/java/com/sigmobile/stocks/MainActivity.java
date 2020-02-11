package com.sigmobile.stocks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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
        getQuoteRequest();
    }

    public void getQuoteRequest() {
        Call<Quote> call = iexCloudAPI.getQuote();
        call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                Log.e("RESP", "onResponse: " + response.body());
                String symbol = response.body().getSymbol();
                String companyName = response.body().getCompanyName();
                float latestPrice = response.body().getLatestPrice();
                float previousClose = response.body().getPreviousClose();
                System.out.println("The symbol is: " + symbol);
                System.out.println("The company name is: " + companyName);
                System.out.println("The latest price of " + symbol + " is: $" + latestPrice);
                System.out.println("The previous close for " + symbol + " was $" + previousClose);
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

}
