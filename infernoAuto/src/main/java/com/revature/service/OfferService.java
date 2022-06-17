package com.revature.service;

import com.revature.model.Offer;

import java.util.ArrayList;
import java.util.List;


public class OfferService {



    List<Offer> offers;



    public OfferService(){
        offers = new ArrayList<>();
    }

    public boolean createOffer(Offer offer){
        return offers.add(offer);
    }

    public List<Offer> getAllOffers(){
        return offers;
    }

    public Offer acceptOffer(Offer offer){
        return offer;
    }

    public Offer getOfferById(int id){
        for(int i = 0; i < offers.size(); i++){
            if(offers.get(i).getOfferId() == id){
                return offers.get(i);
            }
        }

        return null;
    }

    public boolean deleteOfferById(int id){
        for(int i = 0; i < offers.size(); i++){
            if(offers.get(i).getOfferId() == id){
                offers.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean updateOffer(Offer offer){
        for(int i = 0; i < offers.size(); i++){
            if(offers.get(i).getOfferId() == offer.getOfferId()){
                offers.set(i, offer);
                return true;
            }
        }

        return false;
    }

}
