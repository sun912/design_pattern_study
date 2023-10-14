package me.sun.designpatterns._03_behavioral_patterns._17_madiator._02_after;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Guest {
    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int numberOfTowel) {
        this.frontDesk.getTowels(this, numberOfTowel);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
