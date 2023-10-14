package me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.after;

import me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.before.WhiteAnchor;
import me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
