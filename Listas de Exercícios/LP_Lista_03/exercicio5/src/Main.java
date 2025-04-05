import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota (0-10): ");
        score1 = in.nextDouble();

        System.out.println("Digite a segunda nota (0-10): ");
        score2 = in.nextDouble();

        mean = (score1+score2)/2;

        if (score1<0 || score1>10 || score2<0 || score2>10)
            System.out.println("Uma das notas digitadas é inválida");

        else if (mean>=8.5)
            System.out.println("Conceito - A");

        else if (mean>=7)
            System.out.println("Conceito - B");

        else if (mean>=5)
            System.out.println("Conceito - C");

        else if (mean<5)
            System.out.println("Conceito - D");



    }
}