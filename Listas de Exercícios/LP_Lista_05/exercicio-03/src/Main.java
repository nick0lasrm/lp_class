import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] nums = {0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("Digite um número inteiro: ");
        int n = in.nextInt();

        boolean found = false;

        for (int num : nums){
            if (n == num){
                System.out.println(num);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Valor não encontrado!");
        }
    }
}