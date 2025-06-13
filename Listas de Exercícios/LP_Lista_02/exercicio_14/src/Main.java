import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float base, altura, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        base = in.nextFloat();
        System.out.println("Agora digite a altura: ");
        altura = in.nextFloat();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo retângulo é de " + area + "cm²");
    }
}