import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ms, kmh;

        System.out.println("Digite a velocidade em m/s: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        ms = in.nextDouble();

        kmh = ms * 3.6;
        System.out.println(ms + " m/s equivale a " + kmh + " km/h");
    }
}