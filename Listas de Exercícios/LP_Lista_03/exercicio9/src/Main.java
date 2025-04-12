import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo separados por espaços: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a<(b+c) && b<(a+c) && c<(b+a) && a>Math.abs(b-c) && b>Math.abs(a-c) && c>Math.abs(b-a)){
            System.out.println("a, b e c formam um triângulo.");
            if (a==c && b==c)
                System.out.println("Triângulo Equilátero.");
            else if (a==b || b==c || a==c)
                System.out.println("Triângulo Isósceles.");
            else{
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("a, b e c não formam um triângulo.");
        }
    }
}