package me.sun.designpatterns._02_structural_patterns._07_bridge._01_before;

public class PoolPartyAhri implements Champion {
    @Override
    public void move() {
        System.out.println("Poolparty 아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("Poolparty 아리 skill Q");
    }

    @Override
    public void skillW() {
        System.out.println("Poolparty 아리 skill W");
    }

    @Override
    public void skillE() {
        System.out.println("Poolparty 아리 skill E");
    }

    @Override
    public void skillR() {
        System.out.println("Poolparty 아리 skill R");
    }
}
