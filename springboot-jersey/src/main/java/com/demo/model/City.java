package com.demo.model;

/**
 * Created by Angela on 2017/4/20.
 */
public class City {
    /**
     * id
     */
    private Long id;
    /**
     * 城市名称
     */
    private String cityName;
    /**
     * 城市代码
     */
    private String cityCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }
}
