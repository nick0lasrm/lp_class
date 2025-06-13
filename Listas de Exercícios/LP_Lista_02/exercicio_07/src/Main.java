import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milimetro, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em milimetros: ");
        milimetro = in.nextDouble();

        pol = milimetro / 25.4;
        
        System.out.println(milimetro + " mm equivale a " + pol + " pol");
    }
}