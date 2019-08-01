package com.if12.holidaykuy.model;

public class RestorantModel {
    private int idgrid;
    private String location;
    private String imgActivityUrl;
    private String caption;
    private String nama;
    private Double Lat;
    private Double Lng;
    private String kontak;
    private String web;

    public int getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(int idgrid) {
        this.idgrid = idgrid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImgActivityUrl() {
        return imgActivityUrl;
    }

    public void setImgActivityUrl(String imgActivityUrl) {
        this.imgActivityUrl = imgActivityUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        Lng = lng;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
