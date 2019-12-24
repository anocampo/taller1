package Patos;

import Interfaces.Cuackable;
import Interfaces.Swimable;

public class Hule extends Pato implements Cuackable, Swimable {
    @Override
    public void doCuack() {
        System.out.println("Cuack desde un pato de hule");
    }

    @Override
    public void doSwim() {
        System.out.println("Nadando desde un pato de hule");

    }
}
