import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que zero: ");
        num = in.nextInt();

        int soma = somaNums(num);

        System.out.println("A soma de todos os numeros é: " + soma);
    }

    public static int somaNums(int num) {
        int soma = 0;
        for(int i=0;i<=num;i++){
            soma += i;
        }
        return soma;
    }

    /* Recursividade */
    public static int somarAntecessores(int num) {
        if(num==1)
            return 1;
        return num + somarAntecessores(num-1);
    }

}