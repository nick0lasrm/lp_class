import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio, altura, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do cone: ");
        raio = in.nextFloat();
        System.out.println("Agora digite a altura: ");
        altura = in.nextFloat();

        volume =(float) Math.PI * raio * raio * altura / 3;

        System.out.println("O volume do cone é de " + volume + "cm³");
    }
}