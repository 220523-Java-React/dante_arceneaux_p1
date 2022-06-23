package com.revature.repository;

import com.revature.model.Employee;
import com.revature.model.Offer;
import com.revature.model.Role;
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
        }
        return null;
    }
}