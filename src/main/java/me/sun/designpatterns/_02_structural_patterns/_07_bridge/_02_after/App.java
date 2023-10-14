package me.sun.designpatterns._02_structural_patterns._07_bridge._02_after;

public class App {
    public static void main(String[] args) {
        Champion kdaAhri = new Ahri(new Kda());
        kdaAhri.skillQ();
        kdaAhri.skillW();

        Champion poolPartyAhri = new Ahri(new PoolParty());
        poolPartyAhri.skillQ();
        poolPartyAhri.skillW();
    }
}
