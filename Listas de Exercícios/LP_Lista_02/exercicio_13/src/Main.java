import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, area;

        System.out.println("Digíte o raio do círculo: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        raio = in.nextDouble();

        area = (raio * raio) * 3.14;
        System.out.println("A área do círculo é de " + area + "cm²");
    }
}