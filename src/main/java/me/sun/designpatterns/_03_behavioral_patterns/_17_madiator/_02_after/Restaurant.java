package me.sun.designpatterns._03_behavioral_patterns._17_madiator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    public void dinner(Integer id, LocalDateTime dateTime) {
        System.out.println(id + "guest made dinner reservation to " + dateTime);
    }
}
