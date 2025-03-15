import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float velin, acel, time, velfin;

        System.out.println("Digite a velocidade inicial: ");
        System.out.println("Agora digite a aceleração: ");
        System.out.println("Digite também o tempo do percurso: ");

        Scanner in = new Scanner(System.in);
        velin = in.nextFloat();
        acel = in.nextFloat();
        time = in.nextFloat();


        velfin = (velin + acel) * time;

        System.out.println("A velocidade final é de " + velfin + "m/s");
    }
}