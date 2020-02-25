package com.sigmobile.stocks;

public class Intraday {
    private String date;
    private String minute;
    private String label;
    private String high = null;
    private String low = null;
    private String open = null;
    private String close = null;
    private String average = null;
    private float volume;
    private float notional;
    private float numberOfTrades;


    // Getter Methods
    public String getDate() {
        return date;
    }

    public String getMinute() {
        return minute;
    }

    public String getLabel() {
        return label;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getOpen() {
        return open;
    }

    public String getClose() {
        return close;
    }

    public String getAverage() {
        return average;
    }

    public float getVolume() {
        return volume;
    }

    public float getNotional() {
        return notional;
    }

    public float getNumberOfTrades() {
        return numberOfTrades;
    }

    // Setter Methods

    public void setDate(String date) {
        this.date = date;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setNotional(float notional) {
        this.notional = notional;
    }

    public void setNumberOfTrades(float numberOfTrades) {
        this.numberOfTrades = numberOfTrades;
    }
}

