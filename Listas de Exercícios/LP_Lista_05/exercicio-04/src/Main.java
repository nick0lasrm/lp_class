import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[10];

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dez números inteiros: ");
        for (int i=0;i<10;i++){
            vetor[i] = in.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int nMaior = 0;
        int nMenor = 0;

        for (int i=1;i<10;i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                nMaior = i;
            }
            if (vetor[i] < menor){
                menor = vetor[i];
                nMenor = i;
            }
        }

        System.out.println("Maior número: " + maior + " Posição: " + nMaior);
        System.out.println("Menor número: " + menor + " Posição: " + nMenor);
    }
}