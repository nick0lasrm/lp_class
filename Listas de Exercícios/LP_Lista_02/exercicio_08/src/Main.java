import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milimetro, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em polegada: ");
        pol = in.nextDouble();

        milimetro = pol * 25.4;
        
        System.out.println(pol + " pol equivale a " + milimetro + " mm");
    }
}