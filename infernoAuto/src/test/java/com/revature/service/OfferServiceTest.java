package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Offer;

import java.util.List;

import org.junit.jupiter.api.Test;

class OfferServiceTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link OfferService}
     *   <li>{@link OfferService#getAllOffers()}
     * </ul>
     */
    @Test
    void testConstructor() {
        // Arrange and Act
        OfferService actualOfferService = new OfferService();

        // Assert
        List<Offer> expectedAllOffers = actualOfferService.offers;
        assertSame(expectedAllOffers, actualOfferService.getAllOffers());
    }

    /**
     * Method under test: {@link OfferService#createOffer(Offer)}
     */
    @Test
    void testCreateOffer() {
        // Arrange
        OfferService offerService = new OfferService();

        // Act and Assert
        assertTrue(offerService.createOffer(new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status")));
        assertEquals(1, offerService.getAllOffers().size());
    }

    /**
     * Method under test: {@link OfferService#acceptOffer(Offer)}
     */
    @Test
    void testAcceptOffer() {
        // Arrange
        OfferService offerService = new OfferService();
        Offer offer = new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status");

        // Act and Assert
        assertSame(offer, offerService.acceptOffer(offer));
    }

    /**
     * Method under test: {@link OfferService#getOfferById(int)}
     */
    @Test
    void testGetOfferById() {
        // Arrange, Act and Assert
        assertNull((new OfferService()).getOfferById(1));
    }

    /**
     * Method under test: {@link OfferService#deleteOfferById(int)}
     */
    @Test
    void testDeleteOfferById() {
        // Arrange, Act and Assert
        assertFalse((new OfferService()).deleteOfferById(1));
    }

    /**
     * Method under test: {@link OfferService#updateOffer(Offer)}
     */
    @Test
    void testUpdateOffer() {
        // Arrange
        OfferService offerService = new OfferService();

        // Act and Assert
        assertFalse(offerService.updateOffer(new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status")));
    }
}

