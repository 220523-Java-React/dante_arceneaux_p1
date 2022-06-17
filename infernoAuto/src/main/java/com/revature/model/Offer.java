package com.revature.model;

import lombok.ToString;



public class Offer {

    private int id;
    private String offerType;
    private String offerDate;
    private int offerPrice;
    private String offerStatus;

    Offer (){
    }

    public Offer(int offerId, String offerType,
                 String offerDate, int offerPrice,
                 String offerStatus) {
        this.id = id;
        this.offerType = offerType;
        this.offerDate = offerDate;
        this.offerPrice = offerPrice;
        this.offerStatus = offerStatus;
    }

    public int getOfferId() {
        return id;
    }

    public void setOfferId(int offerId) {
        this.id = offerId;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
    }

    //tostring

    @Override
    public String toString() {
        return "Offer [offer=" + id + ", offerType=" + offerType + ", offerDate=" + offerDate + ", offerPrice=" + offerPrice + ", offerStatus=" + offerStatus + "]";
    }

    public boolean add(Offer offer) {
        return true;
    }

    public int getId() {
        return id;
    }
}
