import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, raio, hipot, x, area, perimetro;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("--------------------------\n" +
                            "Menu:\n" +
                            "   1. Círculo\n" +
                            "   2. Triângulo Retângulo\n" +
                            "   3. Retângulo\n" +
                            "--------------------------");
        System.out.println("Escolha uma opção: \n" +
                            "--------------------------");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Informe o raio: \n" +
                                    "--------------------------");
                raio = in.nextDouble();
                area = Math.PI*Math.pow(raio,2);
                perimetro = 2*Math.PI*raio;
                System.out.printf("Área = %.2fcm² \n", area);
                System.out.printf("Perimetro = %.2fcm", perimetro);
            break;
            case 2:
                System.out.println("Informe a base: \n" +
                                    "Informe a altura: \n" +
                                    "--------------------------");
                base = in.nextDouble();
                altura = in.nextDouble();

                area = base*altura/2;
                hipot = Math.pow(base,2)+Math.pow(altura,2);
                x = Math.sqrt(hipot);
                perimetro = base+altura+x;
                System.out.printf("Área = %.2fcm² \n", area);
                System.out.printf("Perimetro = %.2fcm", perimetro);
            break;
            case 3:
                System.out.println("Informe a base: \n" +
                                    "Informe a altura: \n" +
                                    "--------------------------");
                base = in.nextDouble();
                altura = in.nextDouble();

                area = base*altura;
                perimetro = 2*(base+altura);
                System.out.printf("Área = %.2fcm² \n", area);
                System.out.printf("Perimetro = %.2fcm", perimetro);
        }
    }
}