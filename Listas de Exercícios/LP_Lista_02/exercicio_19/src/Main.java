import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double coeA, coeB, coeC, delta, x1, x2;

        System.out.println("Digite os valores de a, b e c separados por espaços: ");

        Scanner in = new Scanner(System.in);
        coeA = in.nextDouble();
        coeB = in.nextDouble();
        coeC = in.nextDouble();

        delta = Math.pow(coeB,2) - 4 * coeA * coeC;
        x1 = (- coeB + Math.sqrt(delta)) / (2 * coeA);
        x2 = (- coeB - Math.sqrt(delta)) / (2 * coeA);

        System.out.println("O valor de X1 é " + x1 + " e o de X2 " + x2);
    }
}