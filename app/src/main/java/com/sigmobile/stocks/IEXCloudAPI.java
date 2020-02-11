package com.sigmobile.stocks;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IEXCloudAPI {
    String APIKEY = "your api key here";

    @GET("twtr/quote?token=" + APIKEY)
    Call<Quote> getQuote();
}
