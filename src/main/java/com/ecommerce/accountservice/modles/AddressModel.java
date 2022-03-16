package com.ecommerce.accountservice.modles;

public class AddressModel {
    private String street;
    private String colony;
    private String area;
    private String city;
    private String pinCode;

    public AddressModel(String street, String colony) {
        this.street = street;
        this.colony = colony;
    }

    public AddressModel() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "street='" + street + '\'' +
                ", colony='" + colony + '\'' +
                '}';
    }
}
