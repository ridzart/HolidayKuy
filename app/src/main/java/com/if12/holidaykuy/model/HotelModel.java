package com.if12.holidaykuy.model;

public class HotelModel {
    private int idgrid;
    private String title;
    private String contact;
    private String description;
    private String imgUrl;

    public HotelModel(){
    }

    public HotelModel(String title, String contact, String description, String imgUrl) {
        this.title = title;
        this.contact = contact;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String kategori) {
        this.contact = kategori;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(int idgrid) {
        this.idgrid = idgrid;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
