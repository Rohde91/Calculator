import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //psvm

        //System.out.println("= " + sum);
        System.out.println("Den første simple lommeregner.");
        System.out.println("Indtast en værdi af gangen og afslut med enter.");

        boolean exit = false;
        while (!exit) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Indtast første tal.");
            double x = scanner.nextInt();

            System.out.println("[ + | - | / | * ]");
            String symbol = scanner.next();

            System.out.println("Indtast andet tal.");
            double y = scanner.nextInt();

            if (symbol.equals("+")) {
                System.out.println("= " + (x + y));
            }
            if (symbol.equals("-")) {
                System.out.println("= " + (x - y));
            }
            if (symbol.equals("*")) {
                System.out.println("= " + (x * y));
            }
            if (symbol.equals("/")) {
                System.out.println("= " + (x / y));

            }
        }
    }
}