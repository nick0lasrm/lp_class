import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = in.nextInt();

        if (n <= 1){
            System.out.println(n + " É primo");
        }else {
            for(int i=1;i<n;i++){
                if (n % i == 0){
                    System.out.println(n + " Não é primo");
                }
            }
        }


    }
}