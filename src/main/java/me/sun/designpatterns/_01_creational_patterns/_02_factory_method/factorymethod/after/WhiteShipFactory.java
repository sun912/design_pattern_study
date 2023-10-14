package me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after;

public class WhiteShipFactory extends DefaultShipFactory {


    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
