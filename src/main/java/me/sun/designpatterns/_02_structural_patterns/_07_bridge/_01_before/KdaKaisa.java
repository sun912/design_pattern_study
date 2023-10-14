package me.sun.designpatterns._02_structural_patterns._07_bridge._01_before;

public class KdaKaisa implements Champion{
    @Override
    public void move() {
        System.out.println("KDA 카이사 Move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA 카이사 skill Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA 카이사 skill W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA 카이사 skill E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA 카이사 skill R");
    }
}
