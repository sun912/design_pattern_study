package me.sun.designpatterns._03_behavioral_patterns._21_strategy._04_practice;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}
