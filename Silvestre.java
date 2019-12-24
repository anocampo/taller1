package Patos;

import Interfaces.Cuackable;
import Interfaces.Flyable;
import Interfaces.Swimable;

public class Silvestre extends Pato implements Cuackable, Swimable, Flyable, Runnable {
    @Override
    public void doCuack() {
    System.out.println("Cuack de un pato silvestre");
    }

    @Override
    public void doFly() {
        System.out.println("Volando con un pato silvestre");

    }

    @Override
    public void doSwim() {
        System.out.println("Nadando con el pato silvestre");

    }

    @Override
    public void run() {
        System.out.println("Corriendo");
    }
}
