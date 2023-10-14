package me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.before;

public class Client {
    public static void main(String[] args) {

        Ship whiteship = ShipFactory.orderShip("whiteship", "sun@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "sun@mail.com");
        System.out.println(blackship);

    }
}
