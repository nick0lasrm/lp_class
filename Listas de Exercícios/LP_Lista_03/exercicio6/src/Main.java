import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("8");
        System.out.println("Escolha uma das opções");
        opcao = in.nextInt();

        switch (opcao){
            case 5:
                System.out.println("Você escolheu a opção 5");
                break;
            case 6:
                System.out.println("Você escolheu a opção 6");
                break;
            case 7:
                System.out.println("Você escolheu a opção 7");
                break;
            case 8:
                System.out.println("Você escolheu a opção 8");
                break;
            case 9:
                System.out.println("Você escolheu a opção 9");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }




    }
}