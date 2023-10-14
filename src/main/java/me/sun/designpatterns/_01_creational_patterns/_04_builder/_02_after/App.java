package me.sun.designpatterns._01_creational_patterns._04_builder._02_after;

import me.sun.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
    }
}
