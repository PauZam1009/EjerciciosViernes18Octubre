package Ejercicios;

import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add("Date");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        ArrayList<String> commonElements = new ArrayList<>();

        for (String fruit : list1) {
            if (list2.contains(fruit)) {
                commonElements.add(fruit);
            }
        }

        System.out.println("Elementos comunes: " + commonElements);
    }
}
