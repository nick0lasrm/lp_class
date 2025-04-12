import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, a, area, perimetro;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("--------------------------\n" +
                            "Menu:\n" +
                            "   1. Círculo\n" +
                            "   2. Triângulo Retângulo\n" +
                            "   3. Retângulo\n" +
                            "--------------------------");
        System.out.println("Escolha uma opção: \n" +
                            "--------------------------");
        option = in.nextInt();

        System.out.println("Informe a base: \n" +
                            "Informe a altura: \n" +
                            "--------------------------");
        b = in.nextDouble();
        a = in.nextDouble();

        switch (option){
            case 1:
                area =
        }
    }
}