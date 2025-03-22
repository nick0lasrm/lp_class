import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double coeA, coeB, x;

        System.out.println("Digite o coeficiente A: ");
        System.out.println("Agora digite o B: ");

        Scanner in = new Scanner(System.in);
        coeA = in.nextDouble();
        coeB = in.nextDouble();

        x = - coeB / coeA;
        System.out.println("O valor de x é " + x);
    }
}