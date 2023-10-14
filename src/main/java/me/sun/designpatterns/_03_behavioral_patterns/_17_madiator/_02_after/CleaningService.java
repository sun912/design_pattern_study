package me.sun.designpatterns._03_behavioral_patterns._17_madiator._02_after;

public class CleaningService {
    private FrontDesk frontDesk = new FrontDesk();
    public void getTowels(Integer guestId, int numberOfTowel) {
        String roomNumber = this.frontDesk.getRoomNumber();
        System.out.println("provide " + numberOfTowel + " to " + roomNumber);
    }
}
