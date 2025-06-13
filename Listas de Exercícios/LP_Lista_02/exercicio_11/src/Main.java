import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = in.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        
        System.out.println(celsius + " °C equivale a " + fahrenheit + " F");
    }
}