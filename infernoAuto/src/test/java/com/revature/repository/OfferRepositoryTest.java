package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.revature.model.Offer;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

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
        // Arrange, Act and Assert
        assertTrue((new OfferRepository()).getAll().isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link OfferRepository#OfferRepository(List)}
     *   <li>{@link OfferRepository#getAll()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        // Arrange
        ArrayList<Offer> offerList = new ArrayList<>();

        // Act and Assert
        assertSame(offerList, (new OfferRepository(offerList)).getAll());
    }

    /**
     * Method under test: {@link OfferRepository#createUser(Offer)}
     */
    @Test
    void testCreateUser() {
        // Arrange
        OfferRepository offerRepository = new OfferRepository();
        Offer offer = new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status");

        // Act and Assert
        assertSame(offer, offerRepository.createUser(offer));
        assertEquals(1, offerRepository.getAll().size());
    }

    /**
     * Method under test: {@link OfferRepository#createUser(Object)}
     */
    @Test
    void testCreateUser2() {
        // Arrange, Act and Assert
        assertNull((new OfferRepository()).createUser("42"));
    }

    /**
     * Method under test: {@link OfferRepository#create(Offer)}
     */
    @Test
    void testCreate() {
        // Arrange
        OfferRepository offerRepository = new OfferRepository();

        // Act and Assert
        assertNull(offerRepository.create(new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#getById(int)}
     */
    @Test
    void testGetById() {
        // Arrange, Act and Assert
        assertNull((new OfferRepository()).getById(1));
    }

    /**
     * Method under test: {@link OfferRepository#getById(int)}
     */
    @Test
    void testGetById2() {
        // Arrange
        ArrayList<Offer> offerList = new ArrayList<>();
        offerList.add(new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status"));

        // Act and Assert
        assertNull((new OfferRepository(offerList)).getById(1));
    }

    /**
     * Method under test: {@link OfferRepository#getById(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetById3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.revature.repository.OfferRepository.getById(OfferRepository.java:48)
        //   In order to prevent getById(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getById(int).
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Offer> offerList = new ArrayList<>();
        offerList.add(null);

        // Act
        (new OfferRepository(offerList)).getById(1);
    }

    /**
     * Method under test: {@link OfferRepository#getById(int)}
     */
    @Test
    void testGetById4() {
        // Arrange
        ArrayList<Offer> offerList = new ArrayList<>();
        Offer offer = new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status");

        offerList.add(offer);

        // Act and Assert
        assertSame(offer, (new OfferRepository(offerList)).getById(0));
    }

    /**
     * Method under test: {@link OfferRepository#update(Offer)}
     */
    @Test
    void testUpdate() {
        // Arrange
        OfferRepository offerRepository = new OfferRepository();

        // Act and Assert
        assertNull(offerRepository.update(new Offer(123, "Offer Type", "2020-03-01", 1, "Offer Status")));
    }

    /**
     * Method under test: {@link OfferRepository#deleteById(int)}
     */
    @Test
    void testDeleteById() {
        // Arrange, Act and Assert
        assertFalse((new OfferRepository()).deleteById(1));
    }
}

