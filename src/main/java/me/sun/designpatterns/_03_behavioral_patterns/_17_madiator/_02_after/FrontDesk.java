package me.sun.designpatterns._03_behavioral_patterns._17_madiator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();
    public void getTowels(Guest guest, int numberOfTowel) {
        cleaningService.getTowels(guest.getId(), numberOfTowel);

    }

    public String getRoomNumber() {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
