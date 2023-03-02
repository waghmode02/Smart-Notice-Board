package com.firstapp.imageview;



public class ImageModel {

    public ImageModel(String imageurl) {
        this.imageurl = imageurl;
    }

    public ImageModel() {
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    private  String imageurl;
}
