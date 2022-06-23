package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OfferServiceTest {
    /**
     * Method under test: {@link OfferService#getOffersByOpen()}
     */
    @Test
    void testGetOffersByOpen() {
        assertTrue((new OfferService()).getOffersByOpen().isEmpty());
        assertTrue((new OfferService()).getOffersByOpen().isEmpty());
    }
}

