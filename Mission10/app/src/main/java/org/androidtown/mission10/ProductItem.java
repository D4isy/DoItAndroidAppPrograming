package org.androidtown.mission10;

/**
 * Created by AndroidApp on 2017-07-15.
 */

public class ProductItem {

    String name;
    String manufacturer;
    int countAgent;
    int price;
    int imageRes;

    public ProductItem() {

    }

    public ProductItem(String name, String manufacturer, int countAgent, int price, int imageRes) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.countAgent = countAgent;
        this.price = price;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCountAgent() {
        return countAgent;
    }

    public void setCountAgent(int countAgent) {
        this.countAgent = countAgent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

}