import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio, altura, volume;

        System.out.println("Digite o raio do cone: ");
        System.out.println("Agora digite a altura: ");

        Scanner in = new Scanner(System.in);
        raio = in.nextFloat();
        altura = in.nextFloat();

        volume =(float) 3.14 * raio * raio * altura / 3;

        System.out.println("O volume do cone é de " + volume + "cm³");
    }
}