import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota1, nota2, media;

        System.out.println("Digite a primeira nota: ");
        System.out.println("Digite a segunda nota: ");

        Scanner in = new Scanner(System.in);
        nota1 = in.nextInt();
        nota2 = in.nextInt();

        media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é " + media);
    }
}