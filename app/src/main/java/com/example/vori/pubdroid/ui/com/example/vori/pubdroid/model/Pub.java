package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model;

import java.io.Serializable;

/**
 * Created by Vori on 2017-04-23.
 */

public class Pub implements Serializable{
    private Long id = null;
    private String name = null;
    private String feeling = null;
    private Integer beerPrice = null;

    public Pub(Long id, String name, String feeling, int beerPrice){
        this.id = id;
        this.name = name;
        this.feeling = feeling;
        this.beerPrice = beerPrice;
    }

    public Pub(String name, String feeling, int beerPrice){
        this.id = id;
        this.name = name;
        this.feeling = feeling;
        this.beerPrice = beerPrice;
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

    public String toString(){
        return this.name;
    }
}
