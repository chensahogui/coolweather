package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/10.
 */

public class Country extends DataSupport {
    private  int is;
    private  String countryName;

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    private  String weatherId;
    private  int cityId;

}
