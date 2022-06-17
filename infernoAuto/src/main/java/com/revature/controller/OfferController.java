package com.revature.controller;

import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.service.OfferService;
import io.javalin.http.Handler;

import java.util.List;

public class OfferController {

    OfferService offerService = new OfferService();



    public Handler getAllOffers = ctx -> {
        List<Offer> offers;// create a new list of cars
        offers = offerService.getAllOffers();// get all cars
        // from the service
        ctx.json(offers);// send the list of cars to the
        // client
    };


    public Handler getOfferById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        Offer offer = offerService.getOfferById(id);
    };

    public Handler createOffer = ctx -> {
        Offer offer = ctx.bodyAsClass(Offer.class); // get
        // the
        // car from the client
        offerService.createOffer(offer); // create the
        // car in the service
        ctx.status(201); // set the status code to 201
    };

    public Handler deleteOfferById = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        offerService.deleteOfferById(id); // delete the
        // car from the
        // service
        ctx.status(204); // set the status code to 204
    };

    public Handler updateOffer = ctx -> {
        Offer offer = ctx.bodyAsClass(Offer.class); // get
        // the
        // car from the client
        offerService.updateOffer(offer); // update the car
        // in
        // the
        // service
        ctx.status(204); // set the status code to 204
    };

    public Handler getOfferByIdByUser = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        Offer offer = offerService.getOfferById(id);

    };

    //accept offer
    public Handler acceptOffer = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id")); // get the id from the url
        Offer offer = offerService.getOfferById(id);
    };
}
