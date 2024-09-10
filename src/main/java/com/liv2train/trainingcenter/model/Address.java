package com.liv2train.trainingcenter.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

   
    public Address() {}

 
    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}