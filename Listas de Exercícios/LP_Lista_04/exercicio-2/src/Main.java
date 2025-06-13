import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maior, menor, number;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        Scanner in = new Scanner(System.in);

        for (int i=1; i <=5; i++) {
            System.out.println("Digite o " + i + "° número inteiro");
            number = in.nextInt();

            if (number > maior){
                maior = number;
            }
            if (number < menor){
                menor = number;
            }
        }

        System.out.println("Maior número digitado: \n" + maior);
        System.out.println("Menor número digitado: " + menor);
    }
}