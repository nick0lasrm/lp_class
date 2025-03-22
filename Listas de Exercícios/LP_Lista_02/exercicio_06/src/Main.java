import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mS, kmH;

        System.out.println("Digite a velocidade em m/s: ");

        Scanner in = new Scanner(System.in);
        mS = in.nextDouble();

        kmH = mS * 3.6;
        System.out.println(mS + " m/s equivale a " + kmH + " km/h");
    }
}