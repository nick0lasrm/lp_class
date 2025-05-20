import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int year, option;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        name = in.next();

        System.out.println("Informe o ano de nascimento");
        year = in.nextInt();


        gerarSaudacao(name, year);
        gerarMenu();

        System.out.println("\nExecutra outras ações");
    }

    public static void gerarMenu(){
        System.out.println("Menu: ");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("Opção 3");
    }

    public static void gerarSaudacao(String name, int year){
        System.out.println("\nOlá, bem vindo " + name);
        System.out.println("Você tem: "+ calcularIdade(year) +" anos.");
    }

    public static int calcularIdade(int year){
        return 2025-year;
    }
}