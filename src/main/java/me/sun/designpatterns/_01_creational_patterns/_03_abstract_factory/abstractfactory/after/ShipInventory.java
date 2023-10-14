package me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.after;

import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.Ship;
import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
