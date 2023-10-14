package me.sun.designpatterns._02_structural_patterns._07_bridge._01_before;

public class PoolPartyKaisa implements Champion{
    @Override
    public void move() {
        System.out.println("Poolparty 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("Poolparty 카이사 skill Q");
    }

    @Override
    public void skillW() {
        System.out.println("Poolparty 카이사 skill W");
    }

    @Override
    public void skillE() {
        System.out.println("Poolparty 카이사 skill E");
    }

    @Override
    public void skillR() {
        System.out.println("Poolparty 카이사 skill R");
    }
}
