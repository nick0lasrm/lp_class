import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, div=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        n = in.nextInt();

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                div++;
            }
        }

        if (div == 2){
            System.out.println(n + " É primo");
        }else{
            System.out.println(n + " Não é primo");
        }

    }
}