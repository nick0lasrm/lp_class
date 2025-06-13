import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double coeA, coeB, x;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        coeA = in.nextDouble();
        System.out.println("Agora digite o B: ");
        coeB = in.nextDouble();

        x = - coeB / coeA;
        System.out.println("O valor de x é " + x);
    }
}