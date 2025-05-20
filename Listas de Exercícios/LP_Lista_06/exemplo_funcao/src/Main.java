import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inicialização do programa
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        name = in.next();

        gerarMenu(name);

        System.out.println("\nExecutra outras ações");
    }

    public static void gerarMenu(String name){
        System.out.println("Bem vindo " + name);
        System.out.println("Menu: ");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("Opção 3");
    }
}