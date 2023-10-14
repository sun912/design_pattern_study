package me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException();
        }

        prepareFor(name);
        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }
        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 완료되었습니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비중");
    }

}
