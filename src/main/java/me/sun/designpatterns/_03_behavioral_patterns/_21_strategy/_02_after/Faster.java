package me.sun.designpatterns._03_behavioral_patterns._21_strategy._02_after;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("무궁화 꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("피었습니다. ");
    }
}
