package me.sun.designpatterns._03_behavioral_patterns._17_madiator._01_before;

public class Guest {
    private Restaurant restaurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();
    public void dinner() {
        restaurant.dinner(this);
    }
    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }
}
