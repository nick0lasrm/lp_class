import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota (0-100): ");
        score1 = in.nextDouble();
        System.out.println("Digite a segunda nota (0-100): ");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;
        System.out.println("Média = " + mean);

        System.out.println(mean<50?"Reprovado":"Aprovado");
    }
}