package me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.before;

import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.DefaultShipFactory;
import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
