package Ejercicios;
import java.util.ArrayList;

public class EjercicioUno {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}