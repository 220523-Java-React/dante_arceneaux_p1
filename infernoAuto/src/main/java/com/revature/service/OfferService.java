package com.revature.service;

import com.revature.model.Offer;

import java.util.ArrayList;
import java.util.List;


public class OfferService {


    List<Offer> offers;



    public OfferService() {
        offers = new ArrayList<>();
    }

    public boolean createOffer(Offer offer) {
        return offers.add(offer);
    }

    public List<Offer> getAllOffers() {
        return offers;
    }

    public Offer acceptOffer(Offer offer) {
        return offer;
    }

    public boolean deleteOfferById(int id) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getId() == id) {
                offers.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateOffer(Offer offer) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getId() == offer.getId()) {
                offers.set(i, offer);
                return true;
            }
        }
        return false;
    }

    public boolean deleteOffer(Offer offer) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getId() == offer.getId()) {
                offers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Offer getOfferByOfferType(String offerType) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getOfferType().equals(offerType)) {
                return offers.get(i);
            }
        }
        return null;
    }

    public Offer getOfferByOfferPrice(int offerPrice) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getOfferPrice() == offerPrice) {
                return offers.get(i);
            }
        }
        return null;
    }

    public Offer getOfferByOfferStatus(String offerStatus) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getOfferStatus().equals(offerStatus)) {
                return offers.get(i);
            }
        }
        return null;
    }




}