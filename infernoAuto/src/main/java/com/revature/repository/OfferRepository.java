package com.revature.repository;

import com.revature.model.Offer;

import java.util.ArrayList;
import java.util.List;

public class OfferRepository implements Dao<Offer> {

    private List<Offer> offers;

    public OfferRepository(){
        offers = new ArrayList<>();
    }

    public OfferRepository(List<Offer> offer){
        this.offers = offer;
    }

    @Override
    public Object createObject(Offer offer) {
        return null;
    }

    @Override
    public Offer create(Offer offer) {
        if(offers.add(offer)){
            return offer;
        }
        else{
            return null;
        }
    }


    @Override
    public List<Offer> getAll() {
        return offers;
    }

    @Override
    public Offer getById(int id) {
        for (int i = 0; i < offers.size(); i++) {
            if (offers.get(i).getId() == id) {
                return offers.get(id);
            }
        }
        return null;
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}

