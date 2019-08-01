package com.if12.holidaykuy.model;

public class ListModel {

    private int idActivity;
    private String location;
    private String imgActivityUrl;
    private String caption;
    private String nama;
    private String tracking;
    private Double Lat;
    private Double Lng;
    private String namaLokasi;

    public int getIdActivity() {return idActivity;}

    public void setIdActivity(int idActivity) {this.idActivity = idActivity;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getImgActivityUrl() {return imgActivityUrl;}

    public void setImgActivityUrl(String imgActivityUrl) {this.imgActivityUrl = imgActivityUrl;}

    public String getCaption() {return caption;}

    public void setCaption(String caption) {this.caption = caption;}

    public String getNama() {return nama;}

    public void setNama(String nama){this.nama = nama;}

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
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

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }
}
