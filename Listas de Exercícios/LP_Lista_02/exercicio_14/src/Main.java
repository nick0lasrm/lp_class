import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float base, altura, area;

        System.out.println("Digite a base do triângulo: ");
        System.out.println("Agora digite a altura: ");

        Scanner in = new Scanner(System.in);
        base = in.nextFloat();
        altura = in.nextFloat();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo retângulo é de " + area + "cm²");
    }
}