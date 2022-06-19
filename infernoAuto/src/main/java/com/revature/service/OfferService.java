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



}
