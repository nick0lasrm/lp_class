import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, miles;

        System.out.println("Digite a ditância em milhas: ");

        Scanner in = new Scanner(System.in);
        miles = in.nextDouble();

        km = miles * 1.609;
        System.out.println(miles + " milhas equivale a " + km + " km");
    }
}