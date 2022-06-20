package com.revature.repository;

import com.revature.model.Offer;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfferRepository implements Dao<Offer> {

    private List<Offer> offers;

    public OfferRepository() {
        offers = new ArrayList<>();
    }

    public OfferRepository(List<Offer> offer) {
        this.offers = offer;
    }

    @Override
    public Object createObject(Offer offer) {
        return null;
    }

    @Override
    public Offer create(Offer offer) {
        return null;
    }


    public Offer createOffer(Offer offer) {
        // we are receiving a full user object
        // we need a query to insert that record
        //                                                                                1,2,3,4
        String sql = "insert into offerdata(offer_type, offer_price, offer_status) values(?,?,?)";

        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, offer.getOfferType());
            stmt.setInt(2, offer.getOfferPrice());
            stmt.setString(3, offer.getOfferStatus());


            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Offer> getAll() {
        return null;
    }

    @Override
    public Offer getById(int id) {
        return null;
    }


    public List<Offer> getAllOffers() {
        // Empty lists of users, will add any new users from the result set
        List<Offer> offers = new ArrayList<>();


        String sql = "select * from offerdata";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                Offer offer = new Offer();
                offer.setOfferType(results.getString("offer_type"));
                offer.setOfferPrice(results.getInt("offer_price"));
                offer.setOfferStatus(results.getString("offer_status"));

                offers.add(offer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return offers;
    }


    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    public Offer updateCompletedAt(Offer offer) {
        // we are receiving a full user object
        // we need a query to insert that record

        List<Offer> offers = getAllOffers();
        //                                                                                1,2,3,4
        String sql = "update offerdata set completed_at = NOW() where offer_status = 'closed' ";

        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();

            stmt.setTimestamp(-1, offer.getCompletedAt());

            offers.add(offer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public Offer updateOfferStatus(Offer offer) {
        // we are receiving a full user object
        // we need a query to insert that record

        List<Offer> offers = getAllOffers();
        //                                                                                1,2,3,4
        String sql = "update offerdata set offer_status = 'closed' where offer_status = 'open' ";

        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();

            stmt.setString(-1, offer.getOfferStatus());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

}