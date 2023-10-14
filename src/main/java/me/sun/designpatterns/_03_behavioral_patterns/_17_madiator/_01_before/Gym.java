package me.sun.designpatterns._03_behavioral_patterns._17_madiator._01_before;

public class Gym {
    private CleaningService cleanService;
    public void clean() {
        cleanService.clean(this);
    }
}
