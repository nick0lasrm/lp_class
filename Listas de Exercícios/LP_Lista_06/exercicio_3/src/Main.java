import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, expoente;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de X");
        base = in.nextInt();

        System.out.println("Digite o valor de Y");
        expoente = in.nextInt();

        if (expoente < 0){
            System.out.println("O expoente não pode ser negativo.");
            return;
        }

        int result = potencyNum(base, expoente);

        System.out.println("Resultado é: " + result);
    }

    public static int potencyNum(int base, int expoente){
        if (expoente == 0)
            return 1;
        return base * potencyNum(base, expoente - 1);
    }
}