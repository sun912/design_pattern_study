package me.sun.designpatterns._03_behavioral_patterns._21_strategy._04_practice;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 할당합니다.");
    }
}
