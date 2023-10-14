package me.sun.designpatterns._02_structural_patterns._07_bridge._02_after;

public class DefaultChampion implements Champion{
    private Skin skin;
    private String name;
    @Override
    public void move() {
        System.out.printf("%s %s move \n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q \n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W \n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E \n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R \n", skin.getName(), this.name) ;
    }

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }
}
