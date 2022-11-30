package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("perro");
        list.add("pollo");
        list.add("loro");
        list.add("vaca");
        list.add("49");
        list.add("murciélago");
        list.add("serpiente");
        list.add("566889");
        list.add("1");
        list.add("sepia");

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);


    }
}
