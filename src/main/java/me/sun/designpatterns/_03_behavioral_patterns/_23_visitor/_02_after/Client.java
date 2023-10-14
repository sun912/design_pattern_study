package me.sun.designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Device device = new Phone();
        rectangle.accept(device );
    }
}
