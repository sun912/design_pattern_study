package me.sun.designpatterns._03_behavioral_patterns._21_strategy._02_after;



public class Client {
    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        Normal normal = new Normal();
        Faster faster = new Faster();
        game.blueLight(normal);
        game.redLight(normal);

        game.blueLight(faster);
        game.redLight(faster);

    }

}
