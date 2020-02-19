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


    private static IEXCloudAPI iexCloudAPI = null;

    public static IEXCloudAPI getIEXCloudAPI() {
        if (iexCloudAPI != null) {
            return iexCloudAPI;
        }

        Interceptor interceptor = new Interceptor(){
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("Authorization",
                                "API Token: pk_243b38b37f924b15b0eaaf0ab9a57d5f ")
                        .build();
                return chain.proceed(request);
            }
        };

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cloud.iexapis.com/stable/stock/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        iexCloudAPI = retrofit.create(IEXCloudAPI.class);
        return iexCloudAPI;
    }

}
