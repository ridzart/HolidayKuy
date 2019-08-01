package com.if12.holidaykuy.model;

public class RestorantModel {
    private int idgrid;
    private String namarestorant;
    private String contact;
    private String description;
    private String imgUrl;

    public RestorantModel() {
    }

    public RestorantModel(String namarestorant, String contact, String description, String imgUrl) {
        this.namarestorant = namarestorant;
        this.contact = contact;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public int getIdgrid() {
        return idgrid;
    }

    public void setIdgrid(int idgrid) {
        this.idgrid = idgrid;
    }

    public String getNamarestorant() {
        return namarestorant;
    }

    public void setNamarestorant(String namarestorant) {
        this.namarestorant = namarestorant;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
