package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;

public class EjercicioSeis {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Nueva York");
        cities.add("Los Ángeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Phoenix");

        System.out.println("Lista antes de mezclar: " + cities);

        Collections.shuffle(cities);

        System.out.println("Lista después de mezclar: " + cities);
    }
}
