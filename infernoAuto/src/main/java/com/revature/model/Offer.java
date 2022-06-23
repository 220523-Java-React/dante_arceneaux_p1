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

    public Offer(int id, String offerType, int offerPrice, String offerStatus)
    {
        this.id = id;
        this.offerType = offerType;
        this.offerPrice = offerPrice;
        this.offerStatus = offerStatus;
    }


    public Offer setId(int id) {
        this.id = id;
        return this;
    }

    public String getOfferType() {
        return offerType;
    }

    public Offer setOfferType(String offerType) {
        this.offerType = offerType;
        return this;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public Offer setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
        return this;
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public Offer setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus;
        return this;
    }

    public Offer setCompletedAt(Timestamp completedAt) {
        this.completedAt = completedAt;
        return this;
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

    public int getId() {
        return id;
    }
}
