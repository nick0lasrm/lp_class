import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        result = number * number;
        System.out.println(number + " ao quadrado é " + result);
    }
}