import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float velIn, acel, time, velMe;

        System.out.println("Digite a velocidade inicial: ");
        System.out.println("Digite a aceleração: ");
        System.out.println("Digite o tempo do percurso: ");

        Scanner in = new Scanner(System.in);
        velIn = in.nextFloat();
        acel = in.nextFloat();
        time = in.nextFloat();

        velMe = velIn + acel * time;

        System.out.println("A velocidade final é de " + velMe + "m/s");
    }
}