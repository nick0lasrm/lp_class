import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2;
        int media;

        System.out.println("Digite a primeira nota: ");
        System.out.println("Digite a segunda nota: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        nota1 = in.nextDouble();
        nota2 = in.nextDouble();

        media = (int) (nota1 + nota2 + nota2) / 3;

        System.out.println("A média das notas é " + media);
    }
}