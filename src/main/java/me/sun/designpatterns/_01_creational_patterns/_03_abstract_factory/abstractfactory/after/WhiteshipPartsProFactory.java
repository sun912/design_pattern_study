package me.sun.designpatterns._01_creational_patterns._03_abstract_factory.abstractfactory.after;

public class WhiteshipPartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
