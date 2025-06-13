import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mS, kmH;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em Km/h: ");
        kmH = in.nextDouble();

        mS = kmH / 3.6;
        
        System.out.println(kmH + " km/h equivale a " + mS + " m/s");
    }
}