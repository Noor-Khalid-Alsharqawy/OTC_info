package com.example.otcinfo;

import java.io.Serializable;

public class product implements Serializable {
    private drug d;
    private String type;
    private double price;
    private String totalMGrams;
    private String notes;
    private int image;
    private String manufacturer;
    private String country;

    public product(drug dr, String t, double p, String tg, String n, int i){
        d= dr;
        type= t;
        price= p;
        totalMGrams= tg;
        notes= n;
        image= i;
    }

    public product(){
        d= null;    type= null;     price= 0.0;
        totalMGrams= null;    notes= null;    image= 0;
        manufacturer= null;     country= null;
    }

    //d methods
    public drug getD() { return d; }
    public void setD(drug d) { this.d = d; }

    //type methods
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    //price methods
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    //total grams methods
    public String getTotalMGrams() { return totalMGrams; }
    public void setTotalMGrams(String totalGrams) { this.totalMGrams = totalGrams; }

    //notes methods
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    //image methods
    public int getImage() { return image; }
    public void setImage(int image) { this.image = image; }

    //manufacturer methods
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    //country methods
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

}