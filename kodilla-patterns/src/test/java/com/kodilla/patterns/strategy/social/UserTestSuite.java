package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("John Doe");
        User yGen = new YGeneration("Jane Smith");
        User zGen = new ZGeneration("Emily Jones");

        // When
        String millenialSharing = millenial.sharePost();
        String yGenSharing = yGen.sharePost();
        String zGenSharing = zGen.sharePost();

        // Then
        assertEquals("Facebook", millenialSharing);
        assertEquals("Twitter", yGenSharing);
        assertEquals("Snapchat", zGenSharing);
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User millenial = new Millenials("John Doe");

        // When
        String millenialSharing = millenial.sharePost();
        millenial.setSocialPublisher(new TwitterPublisher());
        String newMillenialSharing = millenial.sharePost();

        // Then
        assertEquals("Facebook", millenialSharing);
        assertEquals("Twitter", newMillenialSharing);
    }
}