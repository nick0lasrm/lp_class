import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota (0 e 10): ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota (0 e 10): ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2 + nota2) / 3;
        
        System.out.println("A média das notas é " + media);
    }
}