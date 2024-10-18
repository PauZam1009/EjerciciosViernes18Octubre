package Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EjercicioSiete {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);


        System.out.println("Lista original: " + numbers);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Conjunto sin duplicados: " + uniqueNumbers);
    }
}
