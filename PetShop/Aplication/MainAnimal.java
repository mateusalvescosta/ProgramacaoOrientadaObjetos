package Aplication;

import Entities.Animal;
import Entities.Cachorro;
import Entities.Gato;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {

        ArrayList<Animal> lista = new ArrayList<>();

        Cachorro Buldogue = new Cachorro("Marrento", 5, 15.00);
        Cachorro Poodle = new Cachorro("Florzinha", 3, 12.00);
        Cachorro Beagle = new Cachorro("Frajola", 2, 10.00);
        Gato SemRaça = new Gato("Malvadão", 9, 10);

        lista.add(Buldogue);
        lista.add(Poodle);
        lista.add(Beagle);
        lista.add(SemRaça);

        for (Animal pets : lista) {
            if(pets instanceof Cachorro) {
                System.out.println(lista);
            }
        }

    }
}
