package com.sigmobile.stocks;

public class Quote {
    private String symbol;
    private String companyName;
    private String primaryExchange;
    private String calculationPrice;
    private String open = null;
    private String openTime = null;
    private String close = null;
    private String closeTime = null;
    private String high = null;
    private String low = null;
    private float latestPrice;
    private String latestSource;
    private String latestTime;
    private float latestUpdate;
    private String latestVolume = null;
    private float iexRealtimePrice;
    private float iexRealtimeSize;
    private float iexLastUpdated;
    private String delayedPrice = null;
    private String delayedPriceTime = null;
    private String extendedPrice = null;
    private String extendedChange = null;
    private String extendedChangePercent = null;
    private String extendedPriceTime = null;
    private float previousClose;
    private float previousVolume;
    private float change;
    private float changePercent;
    private String volume = null;
    private float iexMarketPercent;
    private float iexVolume;
    private float avgTotalVolume;
    private float iexBidPrice;
    private float iexBidSize;
    private float iexAskPrice;
    private float iexAskSize;
    private float marketCap;
    private float peRatio;
    private float week52High;
    private float week52Low;
    private float ytdChange;
    private float lastTradeTime;
    private boolean isUSMarketOpen;

    public Quote(String symbol, String companyName, String primaryExchange,
                 String calculationPrice, String open, String openTime, String close,
                 String closeTime, String high, String low, float latestPrice,
                 String latestSource, String latestTime, float latestUpdate,
                 String latestVolume, float iexRealtimePrice, float iexRealtimeSize,
                 float iexLastUpdated, String delayedPrice, String delayedPriceTime,
                 String extendedPrice, String extendedChange, String extendedChangePercent,
                 String extendedPriceTime, float previousClose, float previousVolume,
                 float change, float changePercent, String volume, float iexMarketPercent,
                 float iexVolume, float avgTotalVolume, float iexBidPrice, float iexBidSize,
                 float iexAskPrice, float iexAskSize, float marketCap, float peRatio,
                 float week52High, float week52Low, float ytdChange, float lastTradeTime,
                 boolean isUSMarketOpen) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.primaryExchange = primaryExchange;
        this.calculationPrice = calculationPrice;
        this.open = open;
        this.openTime = openTime;
        this.close = close;
        this.closeTime = closeTime;
        this.high = high;
        this.low = low;
        this.latestPrice = latestPrice;
        this.latestSource = latestSource;
        this.latestTime = latestTime;
        this.latestUpdate = latestUpdate;
        this.latestVolume = latestVolume;
        this.iexRealtimePrice = iexRealtimePrice;
        this.iexRealtimeSize = iexRealtimeSize;
        this.iexLastUpdated = iexLastUpdated;
        this.delayedPrice = delayedPrice;
        this.delayedPriceTime = delayedPriceTime;
        this.extendedPrice = extendedPrice;
        this.extendedChange = extendedChange;
        this.extendedChangePercent = extendedChangePercent;
        this.extendedPriceTime = extendedPriceTime;
        this.previousClose = previousClose;
        this.previousVolume = previousVolume;
        this.change = change;
        this.changePercent = changePercent;
        this.volume = volume;
        this.iexMarketPercent = iexMarketPercent;
        this.iexVolume = iexVolume;
        this.avgTotalVolume = avgTotalVolume;
        this.iexBidPrice = iexBidPrice;
        this.iexBidSize = iexBidSize;
        this.iexAskPrice = iexAskPrice;
        this.iexAskSize = iexAskSize;
        this.marketCap = marketCap;
        this.peRatio = peRatio;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.ytdChange = ytdChange;
        this.lastTradeTime = lastTradeTime;
        this.isUSMarketOpen = isUSMarketOpen;
    }

    // Getter Methods

    public String getSymbol() {
        return symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public String getOpen() {
        return open;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getClose() {
        return close;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public float getLatestPrice() {
        return latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public float getLatestUpdate() {
        return latestUpdate;
    }

    public String getLatestVolume() {
        return latestVolume;
    }

    public float getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public float getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public float getIexLastUpdated() {
        return iexLastUpdated;
    }

    public String getDelayedPrice() {
        return delayedPrice;
    }

    public String getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public String getExtendedPrice() {
        return extendedPrice;
    }

    public String getExtendedChange() {
        return extendedChange;
    }

    public String getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public String getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public float getPreviousClose() {
        return previousClose;
    }

    public float getPreviousVolume() {
        return previousVolume;
    }

    public float getChange() {
        return change;
    }

    public float getChangePercent() {
        return changePercent;
    }

    public String getVolume() {
        return volume;
    }

    public float getIexMarketPercent() {
        return iexMarketPercent;
    }

    public float getIexVolume() {
        return iexVolume;
    }

    public float getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public float getIexBidPrice() {
        return iexBidPrice;
    }

    public float getIexBidSize() {
        return iexBidSize;
    }

    public float getIexAskPrice() {
        return iexAskPrice;
    }

    public float getIexAskSize() {
        return iexAskSize;
    }

    public float getMarketCap() {
        return marketCap;
    }

    public float getPeRatio() {
        return peRatio;
    }

    public float getWeek52High() {
        return week52High;
    }

    public float getWeek52Low() {
        return week52Low;
    }

    public float getYtdChange() {
        return ytdChange;
    }

    public float getLastTradeTime() {
        return lastTradeTime;
    }

    public boolean getIsUSMarketOpen() {
        return isUSMarketOpen;
    }

    // Setter Methods

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setLatestPrice(float latestPrice) {
        this.latestPrice = latestPrice;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public void setLatestUpdate(float latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public void setLatestVolume(String latestVolume) {
        this.latestVolume = latestVolume;
    }

    public void setIexRealtimePrice(float iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public void setIexRealtimeSize(float iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public void setIexLastUpdated(float iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public void setDelayedPrice(String delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public void setDelayedPriceTime(String delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public void setExtendedPrice(String extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public void setExtendedChange(String extendedChange) {
        this.extendedChange = extendedChange;
    }

    public void setExtendedChangePercent(String extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public void setExtendedPriceTime(String extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public void setPreviousClose(float previousClose) {
        this.previousClose = previousClose;
    }

    public void setPreviousVolume(float previousVolume) {
        this.previousVolume = previousVolume;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public void setChangePercent(float changePercent) {
        this.changePercent = changePercent;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setIexMarketPercent(float iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public void setIexVolume(float iexVolume) {
        this.iexVolume = iexVolume;
    }

    public void setAvgTotalVolume(float avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public void setIexBidPrice(float iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public void setIexBidSize(float iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public void setIexAskPrice(float iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public void setIexAskSize(float iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public void setMarketCap(float marketCap) {
        this.marketCap = marketCap;
    }

    public void setPeRatio(float peRatio) {
        this.peRatio = peRatio;
    }

    public void setWeek52High(float week52High) {
        this.week52High = week52High;
    }

    public void setWeek52Low(float week52Low) {
        this.week52Low = week52Low;
    }

    public void setYtdChange(float ytdChange) {
        this.ytdChange = ytdChange;
    }

    public void setLastTradeTime(float lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public void setIsUSMarketOpen(boolean isUSMarketOpen) {
        this.isUSMarketOpen = isUSMarketOpen;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "symbol='" + symbol + '\'' +
                ", companyName='" + companyName + '\'' +
                ", primaryExchange='" + primaryExchange + '\'' +
                ", calculationPrice='" + calculationPrice + '\'' +
                ", open='" + open + '\'' +
                ", openTime='" + openTime + '\'' +
                ", close='" + close + '\'' +
                ", closeTime='" + closeTime + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", latestPrice=" + latestPrice +
                ", latestSource='" + latestSource + '\'' +
                ", latestTime='" + latestTime + '\'' +
                ", latestUpdate=" + latestUpdate +
                ", latestVolume='" + latestVolume + '\'' +
                ", iexRealtimePrice=" + iexRealtimePrice +
                ", iexRealtimeSize=" + iexRealtimeSize +
                ", iexLastUpdated=" + iexLastUpdated +
                ", delayedPrice='" + delayedPrice + '\'' +
                ", delayedPriceTime='" + delayedPriceTime + '\'' +
                ", extendedPrice='" + extendedPrice + '\'' +
                ", extendedChange='" + extendedChange + '\'' +
                ", extendedChangePercent='" + extendedChangePercent + '\'' +
                ", extendedPriceTime='" + extendedPriceTime + '\'' +
                ", previousClose=" + previousClose +
                ", previousVolume=" + previousVolume +
                ", change=" + change +
                ", changePercent=" + changePercent +
                ", volume='" + volume + '\'' +
                ", iexMarketPercent=" + iexMarketPercent +
                ", iexVolume=" + iexVolume +
                ", avgTotalVolume=" + avgTotalVolume +
                ", iexBidPrice=" + iexBidPrice +
                ", iexBidSize=" + iexBidSize +
                ", iexAskPrice=" + iexAskPrice +
                ", iexAskSize=" + iexAskSize +
                ", marketCap=" + marketCap +
                ", peRatio=" + peRatio +
                ", week52High=" + week52High +
                ", week52Low=" + week52Low +
                ", ytdChange=" + ytdChange +
                ", lastTradeTime=" + lastTradeTime +
                ", isUSMarketOpen=" + isUSMarketOpen +
                '}';
    }
}
