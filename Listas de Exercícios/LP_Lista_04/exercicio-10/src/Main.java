import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int f1 = 0;
        int f2 = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        n = in.nextInt();

        for (int i=0;i<n;i++){
            System.out.println(f1 + " ");

            int proximo = f1 + f2;
            f1 = f2;
            f2 = proximo;
        }
    }
}