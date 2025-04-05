import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2 , result;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println( "---------------------------" +
                            "\nMENU" +
                            "\n---------------------------" +
                            "\n1. Soma" +
                            "\n2. Subtração" +
                            "\n3. Multiplicação" +
                            "\n4. Divisão" +
                            "\n---------------------------" +
                            "\nEscolha uma opção");

        switch (option){
            case 1:
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}