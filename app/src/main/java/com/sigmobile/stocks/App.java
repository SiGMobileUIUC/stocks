package com.sigmobile.stocks;

import android.app.Application;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static StockNewsAPI stockNewsAPI = null;
    private static StockInfoAPI stockInfoAPI = null;

    public static StockNewsAPI getStockNewsAPI() {
        if (stockNewsAPI != null) {
            return stockNewsAPI;
        }

        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("Authorization", "API_TOKEN_HERE")
                        .build();
                return chain.proceed(request);
            }
        };

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("STOCK_API_BASE_URL")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        stockNewsAPI = retrofit.create(StockNewsAPI.class);
        return stockNewsAPI;
    }

    public static StockInfoAPI getStockInfoAPI() {
        if (stockInfoAPI != null) {
            return stockInfoAPI;
        }

        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("Authorization", "API_TOKEN_HERE")
                        .build();
                return chain.proceed(request);
            }
        };

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("STOCK_INFO_API_BASE_URL")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        stockInfoAPI = retrofit.create(StockInfoAPI.class);
        return stockInfoAPI;
    }

}
