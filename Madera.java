package Patos;

import Interfaces.Swimable;

public class Madera extends Pato implements Swimable {
    @Override
    public void doSwim() {
        System.out.println("Nadando desde un pato de madera");
    }
}
