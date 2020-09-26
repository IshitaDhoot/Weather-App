package com.ishitadhoot.whatstheweather;

/**
 * Created by ishitadhoot on 6/18/20.
 */

public class WeatherInfo {
    private String city;
    private String description;

    public WeatherInfo(String city, String description) {
        this.city = city;
        this.description = description;
    }

    public String getCity() {
        return this.city;
    }

    public String getDescription() {
        return this.description;
    }
}
