package com.revature.repository;

import com.revature.Driver;
import com.revature.model.Offer;
import com.revature.model.Role;
import com.revature.model.User;
import com.revature.util.ConnectionUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfferRepository implements Dao<Offer> {

    static Logger logger = LoggerFactory.getLogger(Driver.class);
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
            logger.warn("Error creating offer");
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

    public Offer getOfferById(int id) {

        String sql = "select * from offerdata where id = ?";
        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // build return the user and return it
                return new Offer()
                        .setId(rs.getInt("id"))
                        .setOfferType(rs.getString("offer_type"))
                        .setOfferPrice(rs.getInt("offer_price"))
                        .setOfferStatus(rs.getString("offer_status"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("Error getting offer");
        }
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
                offer.setId(results.getInt("id"));
                offer.setOfferType(results.getString("offer_type"));
                offer.setOfferPrice(results.getInt("offer_price"));
                offer.setOfferStatus(results.getString("offer_status"));

                offers.add(offer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("Error getting all offers");
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

    public Offer updateOfferById(int id, Offer offer) {

        String sql = "update offerdata set offer_type = ?, offer_price = ?, offer_status = ? where id = ?";
        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, offer.getOfferType());
            stmt.setInt(2, offer.getOfferPrice());
            stmt.setString(3, offer.getOfferStatus());
            stmt.setInt(4, id);

            int success = stmt.executeUpdate();
            if (success == 1) {
                return offer;
            }

        } catch (SQLException e) {
            //must be an employee
            e.printStackTrace();
            System.out.println("You are not an employee");
            logger.warn("Error updating offer");
        }
        return null;
    }

    public Offer deleteOfferById(int id) {
        String sql = "delete from offerdata where id = ?";
        try {
            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            int success = stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("Error deleting offer");
        }
        return null;
    }


    //getByOpenOffer
    public List<Offer> getByOpenOffer() {
        String sql = "select * from offerdata where offer_status = 'open'";

        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // go through each result, build a User object for that data, add that user object the users list
                Offer offer = new Offer();
                offer.setId(rs.getInt("id"));
                offer.setOfferType(rs.getString("offer_type"));
                offer.setOfferPrice(rs.getInt("offer_price"));
                offer.setOfferStatus(rs.getString("offer_status"));

                offers.add(offer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("Error getting all offers");
        }

        return offers;
    };


    //ACCEPT OR REJECT OFFER

    public Offer acceptOffer(int id) {
        String sql = "update offerdata set offer_status = 'closed' where id = ?";
        try {

            Connection connection = ConnectionUtility.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            int success = stmt.executeUpdate();
            if (success == 1) {
                return getOfferById(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            logger.warn("Error updating offer");
        }
        return null;
    }



}



























