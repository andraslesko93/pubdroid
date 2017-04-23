package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model;

/**
 * Created by Vori on 2017-04-23.
 */

public class Pub {
    private Long id = null;
    private String name = null;
    private String feeling = null;
    private Integer beerPrice = null;
    private Double longitude = null;
    private Double latitude = null;

    public Pub(Long id, String name, String feeling, Integer beerPrice, Double latitude, Double longitude){
        this.id = id;
        this.name = name;
        this.feeling = feeling;
        this.beerPrice = beerPrice;
        this. longitude = longitude;
        this.latitude=latitude;
    }
    public Pub(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling=feeling;
    }

    public Integer getBeerPrice(){
        return beerPrice;
    }

    public void setBeerPrice(Integer beerPrice){
        this.beerPrice=beerPrice;
    }

    public Double getLongitude(){
        return longitude;
    }

    public void setLongitude(Double longitude){
        this.longitude = longitude;
    }

    public Double getLatitude(){
        return latitude;
    }

    public void setLatitude(Double latitude){
        this.latitude=latitude;
    }


}
