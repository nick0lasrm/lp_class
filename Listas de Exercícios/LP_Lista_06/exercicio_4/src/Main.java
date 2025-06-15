import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palavra;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        palavra = in.nextLine();

        if (palindromo(palavra)){
            System.out.println(palavra + " é um palíndromo");
        } else {
            System.out.println(palavra + " não é um palíndromo");
        }

    }

    public static boolean palindromo(String palavra){
        String textoLimpo = palavra.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] letras = textoLimpo.toCharArray();

        int inicio = 0;
        int fim = letras.length - 1;

        while (inicio < fim) {
            if (letras[inicio] != letras[fim]){
                return  false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}