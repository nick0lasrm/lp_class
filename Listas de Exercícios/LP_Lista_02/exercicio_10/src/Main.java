import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a ditância em milhas: ");
        miles = in.nextDouble();

        km = miles * 1.609;
        
        System.out.println(miles + " milhas equivale a " + km + " km");
    }
}