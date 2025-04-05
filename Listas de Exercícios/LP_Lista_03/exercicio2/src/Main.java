import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Digite dois números inteiros separados por espaço: ");

        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " > " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " > " + num1);
        else
            System.out.println(num1 + " = " + num2);

    }
}