import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        num = in.nextInt();

        int fatorial = fatorialNum(num);

        System.out.println("O fatorial do numero digitado é: "+ fatorial);
    }

    public static int fatorialNum(int num){
        int fatorial = 1;
        for(int i=1;i<=num;i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    /* Recursividade */
    public static int fatorial(int num){
        if (num==1)
            return 1;
        return num * fatorial(num-1);
    }
}