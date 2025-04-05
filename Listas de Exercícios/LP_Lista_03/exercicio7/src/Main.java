import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        System.out.println("Digite os valores de A, B e C separados por espaços: ");

        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;
        x1 = (- b + Math.sqrt(delta)) / (2 * a);
        x2 = (- b - Math.sqrt(delta)) / (2 * a);

        if (delta<0)
            System.out.println("Não a uma raiz real, pois o delta é menor que 0");

        else
            System.out.println("X1 = " + x1 + " e X2 = " + x2);

    }
}