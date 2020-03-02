package com.sigmobile.stocks;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IEXCloudAPI {
    String APIKEY = "pk_67a49d1dcd9c4b7f8c848167ed2f8589 ";

    @GET("{ticker}/quote?token=" + APIKEY)
    Call<Quote> getQuote(@Path("ticker") String ticker);

    @GET("{Symbol}/intraday-prices?token=" + APIKEY)
    Call<List<Intraday>> getIntraday(@Path("Symbol") String Symbol);
}
