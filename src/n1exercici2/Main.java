package n1exercici2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("perro");
        list.add("pollo");
        list.add("loro");
        list.add("vaca");
        list.add("burro");
        list.add("murciélago");
        list.add("serpiente");
        list.add("liebre");
        list.add("gato");
        list.add("sepia");

        list.stream().filter(s -> s.contains("o") && s.length()>5).forEach(s-> System.out.println(s));

    }
}