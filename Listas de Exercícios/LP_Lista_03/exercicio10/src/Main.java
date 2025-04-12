import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite três números inteiros separados por espaços: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 < n2){
            if (n2 < n3)
                System.out.println(n1 +"\n"+ n2 +"\n"+ n3);
            else if (n1 < n3){
                System.out.println(n1 +"\n"+ n3 +"\n"+ n2);
            } else{
                System.out.println(n3 +"\n"+ n1 +"\n"+ n2);
            }
                
        }
        else if (n2 < n3){
            if (n1 < n3) {
                System.out.println(n2 +"\n"+ n1 +"\n"+ n3);
            }else{
                System.out.println(n2 +"\n"+ n3 +"\n"+ n1);
            }
        }
    }
}
