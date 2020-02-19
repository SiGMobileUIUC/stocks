package com.sigmobile.stocks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IEXCloudAPI {
    String APIKEY = "pk_243b38b37f924b15b0eaaf0ab9a57d5f ";

    @GET("{ticker}/quote?token=" + APIKEY)
    Call<Quote> getQuote(@Path("ticker") String ticker);
}
