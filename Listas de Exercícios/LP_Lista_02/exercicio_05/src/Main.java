import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ms, kmh;

        System.out.println("Digite a velocidade em Km/h: ");

        Scanner in = new Scanner(System.in);
        kmh = in.nextDouble();

        ms = kmh / 3.6;
        System.out.println(kmh + " km/h equivale a " + ms + " m/s");
    }
}