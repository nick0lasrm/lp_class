import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String jogardnv;

        do {
            int perdeu = 0;

            Scanner in = new Scanner(System.in);

            for (int i=1; i<11 && perdeu == 0; i++) {
                for (int j = 0; j < 11 && perdeu == 0; j++) {
                    System.out.println(i + " x " + j + " = ?");
                    System.out.println("Digite o resultado: ");
                    int result = in.nextInt();

                    if (result != i * j) {
                        System.out.println("Você perdeu!");
                        perdeu = 1;
                    }
                }
            }

            if (perdeu == 0){
                System.out.println("Parabéns!");
            }

            System.out.println("Deseja tentar novamente? (S/N): ");
            jogardnv = in.next();

        } while (jogardnv.equalsIgnoreCase("S"));
    }
}