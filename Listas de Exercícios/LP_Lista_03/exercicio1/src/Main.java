import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, sqrt;

        System.out.println("Digite um número Real: ");

        Scanner in = new Scanner(System.in);
        num = in.nextDouble();


        if (num >= 0) {
            sqrt = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é " + sqrt);
        } else {
            System.out.println("Valor inválido");
        }

    }
}