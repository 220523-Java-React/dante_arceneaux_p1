package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Offer;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OfferRepositoryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link OfferRepository#OfferRepository()}
     *   <li>{@link OfferRepository#getAll()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertNull((new OfferRepository()).getAll());
        assertNull((new OfferRepository(new ArrayList<>())).getAll());
    }

    /**
     * Method under test: {@link OfferRepository#createObject(Offer)}
     */
    @Test
    void testCreateObject() {
        OfferRepository offerRepository = new OfferRepository();
        assertNull(offerRepository.createObject(new Offer(1, "Offer Type", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#create(Offer)}
     */
    @Test
    void testCreate() {
        OfferRepository offerRepository = new OfferRepository();
        assertNull(offerRepository.create(new Offer(1, "Offer Type", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#createOffer(Offer)}
     */
    @Test
    void testCreateOffer() {
        OfferRepository offerRepository = new OfferRepository();
        assertNull(offerRepository.createOffer(new Offer(1, "Offer Type", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#getOfferById(int)}
     */
    @Test
    void testGetOfferById() {
        assertNull((new OfferRepository()).getOfferById(1));
    }

    /**
     * Method under test: {@link OfferRepository#getAllOffers()}
     */
    @Test
    void testGetAllOffers() {
        assertTrue((new OfferRepository()).getAllOffers().isEmpty());
    }

    /**
     * Method under test: {@link OfferRepository#update(Offer)}
     */
    @Test
    void testUpdate() {
        OfferRepository offerRepository = new OfferRepository();
        assertNull(offerRepository.update(new Offer(1, "Offer Type", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        assertFalse((new OfferRepository()).deleteById(1));
    }

    /**
     * Method under test: {@link OfferRepository#updateOfferById(int, Offer)}
     */
    @Test
    void testUpdateOfferById() {
        OfferRepository offerRepository = new OfferRepository();
        assertNull(offerRepository.updateOfferById(1, new Offer(1, "Offer Type", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#deleteOfferById(int)}
     */
    @Test
    void testDeleteOfferById() {
        assertNull((new OfferRepository()).deleteOfferById(1));
    }
}

