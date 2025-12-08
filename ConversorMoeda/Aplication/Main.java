package Aplication;

import Entities.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda cambio = new ConversorMoeda();

        System.out.println(cambio.converterDolarParaReal(5.5, 2));
    }
}
