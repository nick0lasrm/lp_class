import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a ditância em quilômetros: ");
        km = in.nextDouble();

        miles = km / 1.609;
        
        System.out.println(km + " km equivale a " + miles + " milhas");
    }
}