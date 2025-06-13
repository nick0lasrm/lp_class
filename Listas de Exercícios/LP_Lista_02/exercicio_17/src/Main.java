import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float velIn, acel, time, velMe;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade inicial: ");
        velIn = in.nextFloat();
        System.out.println("Digite a aceleração: ");
        acel = in.nextFloat();
        System.out.println("Digite o tempo do percurso: ");
        time = in.nextFloat();

        velMe = velIn + acel * time;

        System.out.println("A velocidade final é de " + velMe + "m/s");
    }
}