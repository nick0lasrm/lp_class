import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float raio, altura, volume;

        System.out.println("Digite o raio do cilindro: ");
        System.out.println("Agora digite a altura: ");

        Scanner in = new Scanner(System.in);
        raio = in.nextFloat();
        altura = in.nextFloat();

        volume =(float) Math.PI * raio * raio * altura;

        System.out.println("O volume do cilindro é de " + volume + "cm³");
    }
}