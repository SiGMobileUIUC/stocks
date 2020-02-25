package com.sigmobile.stocks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IEXCloudAPI {
    String APIKEY = "pk_3d5c1c52748f4c00b649d6678cf2a107 ";

    @GET("{ticker}/quote?token=" + APIKEY)
    Call<Quote> getQuote(@Path("ticker") String ticker);

    @GET("{Symbol}/intraday-prices?token=" + APIKEY)
    Call<Intraday> getIntraday(@Path("Symbol") String Symbol);
}
