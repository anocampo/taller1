package Patos;

import Interfaces.Cuackable;
import Interfaces.Flyable;
import Interfaces.Swimable;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Madera Pinocho = new Madera();
        Silvestre Donas = new Silvestre();
        Hule Gallo = new Hule();
        Hierro Bionico = new Hierro();
        Madera Patasola = new Madera();
        Silvestre Blade = new Silvestre();
        Hule Pepito = new Hule();
        Hierro Zamus = new Hierro();
        Madera Pikachu = new Madera();
        Silvestre MarioBrosh = new Silvestre();
        Hule Fox = new Hule();
        Hierro Falcon = new Hierro();
        WarnerDuck Donald = new WarnerDuck();
        ComicDuck Lucas = new WarnerDuck();

        Lucas.doFly();
        Lucas.doBoom();


        ArrayList<Pato> allDuck = new ArrayList<>();
        allDuck.add(Pinocho);
        allDuck.add(Donas);
        allDuck.add(Gallo);
        allDuck.add(Bionico);
        allDuck.add(Patasola);
        allDuck.add(Blade);
        allDuck.add(Pepito);
        allDuck.add(Zamus);
        allDuck.add(Pikachu);
        allDuck.add(MarioBrosh);
        allDuck.add(Fox);
        allDuck.add(Falcon);
        allDuck.add(Donald);

        for(Pato pato:allDuck){
            System.out.println(pato);
        }

        ArrayList<Swimable> SwimDuck = new ArrayList<>();
        SwimDuck.add(Pinocho);
        SwimDuck.add(Donas);
        SwimDuck.add(Gallo);
        SwimDuck.add(Patasola);
        SwimDuck.add(Blade);
        SwimDuck.add(Pepito);
        SwimDuck.add(Pikachu);
        SwimDuck.add(MarioBrosh);
        SwimDuck.add(Fox);

        for (Swimable pato:SwimDuck){
            pato.doSwim();
        }

        ArrayList<Cuackable> CuackDuck = new ArrayList<>();

        CuackDuck.add(Donas);
        CuackDuck.add(Gallo);
        CuackDuck.add(Blade);
        CuackDuck.add(Pepito);
        CuackDuck.add(MarioBrosh);
        CuackDuck.add(Fox);

        for (Cuackable pato:CuackDuck){
            pato.doCuack();
        }

        ArrayList<Flyable> FlyDuck = new ArrayList<>();

        FlyDuck.add(Donas);
        FlyDuck.add(Blade);
        FlyDuck.add(MarioBrosh);
        FlyDuck.add(Donald);

        for (Flyable pato:FlyDuck){
            pato.doFly();
        }
    }
}
