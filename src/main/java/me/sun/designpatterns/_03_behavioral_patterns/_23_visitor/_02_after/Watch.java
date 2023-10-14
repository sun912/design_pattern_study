package me.sun.designpatterns._03_behavioral_patterns._23_visitor._02_after;

public class  Watch implements Device {
    @Override
    public void print(Triangle triangle) {
        System.out.println("print triangle to the Watch");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print rectangle to the Watch");
    }
}
