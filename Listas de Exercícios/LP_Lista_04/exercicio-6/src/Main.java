import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1, n2, i;
        System.out.println("Digite dois números inteiros separados por espaço: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1 < n2 || n2 < n1) {
            for(i=n1;i<=n2;i++)
                System.out.println(i);
        }
    }

}
