import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, parte;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number = in.nextDouble();

        parte = number / 5;
        
        System.out.println("A quinta parte de " + number + " é " + parte);
    }
}