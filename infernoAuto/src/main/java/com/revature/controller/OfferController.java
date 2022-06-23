package com.revature.controller;

import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.repository.OfferRepository;
import com.revature.service.OfferService;
import io.javalin.http.Handler;

import java.util.List;

public class OfferController {

    OfferRepository offerRepository = new OfferRepository();


    public Handler getAllOffers = ctx -> {
        List<Offer> offers;// create a new list of cars
        offers = offerRepository.getAllOffers();// get all cars
        // from the service
        ctx.json(offers);// send the list of cars to the
        // client
    };


    public Handler createOffer = ctx -> {
        Offer offer = ctx.bodyAsClass(Offer.class); // get
        // the
        // car from the client
        offerRepository.createOffer(offer); // create the
        // car in the service
        ctx.status(201); // set the status code to 201
    };

    public Handler getOfferById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the client
        Offer offer = offerRepository.getOfferById(id); // get the car from the service
        ctx.json(offer); // send the car to the client
    };

    public Handler updateByOfferId = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the client
        Offer offer = ctx.bodyAsClass(Offer.class); // get the car from the client
        offerRepository.updateOfferById(id, offer); // update the car in the service
        ctx.status(201); // set the status code to 201
    };

    public Handler deleteOfferById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        offerRepository.deleteOfferById(id);
        ctx.status(204); // set the status code to 204
    };
}