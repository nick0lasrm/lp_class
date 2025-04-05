import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " é par");
        else
            System.out.println(n + " é impar");

    }
}