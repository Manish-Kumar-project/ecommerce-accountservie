package com.ecommerce.accountservice.modles;

public class AddressRequest {
    private String street;
    private String colony;
    private String area;
    private String city;
    private String pinCode;

    public AddressRequest() {
    }

    public AddressRequest(String street, String colony, String area, String city, String pinCode) {
        this.street = street;
        this.colony = colony;
        this.area = area;
        this.city = city;
        this.pinCode = pinCode;
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
        return "AddressRequest{" +
                "street='" + street + '\'' +
                ", colony='" + colony + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
