package com.revature.controller;

import com.revature.Driver;
import com.revature.model.Car;
import com.revature.model.Offer;
import com.revature.model.User;
import com.revature.repository.OfferRepository;
import com.revature.service.OfferService;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OfferController {
    static Logger logger = LoggerFactory.getLogger(Driver.class);
    OfferRepository offerRepository = new OfferRepository();


    public Handler getAllOffers = ctx -> {
        List<Offer> offers;// create a new list of cars
        offers = offerRepository.getAllOffers();// get all cars
        // from the service
        ctx.json(offers);// send the list of cars to the
        // client
    };


    public Handler createOffer = ctx -> {

        try {
            Offer offer = ctx.bodyAsClass(Offer.class);
            offerRepository.create(offer);
            ctx.status(201);
        } catch (Exception e) {
            ctx.status(400);
            logger.warn("Bad request");
        }
    };

    public Handler getOfferById = ctx -> {
        try {
            int id = Integer.parseInt(ctx.pathParam("id"));
            Offer offer = offerRepository.getOfferById(id);
            ctx.json(offer);
            ctx.status(201);
            logger.info("Offer found");
        } catch (Exception e) {
            ctx.status(400);
            logger.warn("Bad request");
        }
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

    public Handler getByOpenOffer = ctx -> {
        try {
            List<Offer> offers = offerRepository.getByOpenOffer();
            ctx.json(offers);
            ctx.status(201);
            logger.info("Offer found");
        } catch (Exception e) {
            ctx.status(400);
            logger.warn("Bad request");
        }
    };

    public Handler acceptOffer = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id"));
        offerRepository.acceptOffer(id);
        ctx.status(201);
    };
    }


