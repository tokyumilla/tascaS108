package n1exercici8;

public class Main {
    public static void main(String[] args) {
        String testString = "Prueba";

        Reverse test = (s-> {
            StringBuilder result = new StringBuilder();
            for (int i=s.length()-1;i>=0;i--) {
                result.append(s.charAt(i));
            }
            return result.toString();
        });

        System.out.println(test.reverse(testString));
    }





}
