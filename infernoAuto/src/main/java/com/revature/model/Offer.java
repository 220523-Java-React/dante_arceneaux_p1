package com.revature.model;


import java.sql.Timestamp;

public class Offer {

    private int id;
    private String offerType;

    private int offerPrice;
    private String offerStatus;

    private Timestamp completedAt;

    public Offer (){
    }

    public Offer(String offerType, int offerPrice, String offerStatus)
    {
        this.offerType = offerType;
        this.offerPrice = offerPrice;
        this.offerStatus = offerStatus;
    }


    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
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
        return "Offer [offerType=" + offerType + ", offerPrice=" + offerPrice + ", offerStatus="
                + offerStatus + "]";
    }

    public boolean add(Offer offer) {
        return true;
    }

    public Timestamp getCompletedAt() {
        return completedAt;
    }
}
