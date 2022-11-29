package n1exercici3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList months = new ArrayList<>();
        months.add("enero");
        months.add("febrero");
        months.add("marzo");
        months.add("abril");
        months.add("mayo");
        months.add("junio");
        months.add("julio");
        months.add("agosto");
        months.add("septiembre");
        months.add("octubre");
        months.add("noviembre");
        months.add("diciembre");

        months.forEach(s-> System.out.println(s));




    }
}
