package me.sun.designpatterns._01_creational_patterns._04_builder._02_after;

import me.sun.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("resort")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁식사")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치 여행")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
