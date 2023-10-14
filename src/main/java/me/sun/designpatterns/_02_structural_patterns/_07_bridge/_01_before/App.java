package me.sun.designpatterns._02_structural_patterns._07_bridge._01_before;

public class App {
    public static void main(String[] args) {
        Champion kdaAhri = new KdaAhri();
        kdaAhri.skillE();
        kdaAhri.move();
    }
}
