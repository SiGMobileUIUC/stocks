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
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                Log.e("ERR", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

}
