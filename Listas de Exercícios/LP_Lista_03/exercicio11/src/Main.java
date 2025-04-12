import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 7: ");
        n = in.nextInt();

        switch (n){
            case 1:
                System.out.println(n + " - Domingo");
                break;
            case 2:
                System.out.println(n + " - Segunda-Feira");
                break;
            case 3:
                System.out.println(n + " - Terça-Feira");
                break;
            case 4:
                System.out.println(n + " - Quarta-Feira");
                break;
            case 5:
                System.out.println(n + " - Quinta-Feira");
                break;
            case 6:
                System.out.println(n + " - Sexta-Feira");
                break;
            case 7:
                System.out.println(n + " - Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}