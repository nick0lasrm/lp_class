import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mS, kmH;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s: ");
        mS = in.nextDouble();

        kmH = mS * 3.6;
        
        System.out.println(mS + " m/s equivale a " + kmH + " km/h");
    }
}