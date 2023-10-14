package me.sun.designpatterns._01_creational_patterns._02_factory_method.factorymethod.after;



public class Client {
    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "sun@mail.com");
        client.print(new BlackShipFactory(), "blckship", "sun@mail.com");

        Ship whiteship = new WhiteShipFactory().orderShip("whiteship", "sun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("blackship", "sun@mail.com");
        System.out.println(blackship);

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));

    }
}
