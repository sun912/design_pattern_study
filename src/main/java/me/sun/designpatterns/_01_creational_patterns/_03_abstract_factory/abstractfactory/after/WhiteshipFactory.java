package me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.after;

import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.DefaultShipFactory;
import me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
