import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b;
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("podaj 2 liczby");
        a = scan.nextDouble();
        b = scan.nextDouble();

        System.out.printf("\nWynik %.2f", calc.math(a,b));
    }
}
