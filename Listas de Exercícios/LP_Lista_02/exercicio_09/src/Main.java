import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        System.out.println("Digite a medida em polegada: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        km = in.nextDouble();

        miles = km * 25.4;
        System.out.println(km + " km equivale a " + miles + " milhas");
    }
}