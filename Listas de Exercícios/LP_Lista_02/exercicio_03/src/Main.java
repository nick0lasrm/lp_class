import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, parte;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextDouble();

        parte = number / 5;
        System.out.println("A quimta parte de " + number + " é " + parte);
    }
}