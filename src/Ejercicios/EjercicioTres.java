package Ejercicios;

import java.util.ArrayList;

public class EjercicioTres {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Lista original: " + numbers);
        System.out.println("Lita de números pares: " + evenNumbers);
    }
}