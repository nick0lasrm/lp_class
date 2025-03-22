import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, area;


        System.out.println("Digíte o raio do círculo: ");

        Scanner in = new Scanner(System.in);
        raio = in.nextDouble();

        area = Math.PI*Math.pow(raio,2);
        System.out.println("A área do círculo é de " + area + "cm²");
    }
}