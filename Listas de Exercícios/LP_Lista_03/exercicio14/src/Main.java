import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, discount, rate;
        int option, parcela, n;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra: \n" +
                            "---------------------------------");
        value = in.nextDouble();

        System.out.println("---------------------------------\n" +
                            "Menu:\n" +
                            "   1. Crédito\n" +
                            "   2. Débito\n" +
                            "   3. Pix\n" +
                            "--------------------------------");
        System.out.println("Escolha a forma de pagamento: \n" +
                            "--------------------------------");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Crédito selecionado: \n" +
                                    "--------------------------------");
                System.out.println("Você gostaria de parcelar? \n" +
                                    "1. Sim \n" +
                                    "2. Não \n" +
                                    "--------------------------------");
                n = in.nextInt();
                if (n == 1){
                    System.out.println("Escolha o número de parcelas: \n" +
                                        "--------------------------------");
                    parcela = in.nextInt();
                    if (parcela <= 4) {
                        rate = value * 2 / 100;
                        value = rate + value;
                        System.out.printf("Valor final da compra: R$ %.2f", value);
                    }else {
                        rate = value * 5 / 100;
                        value = rate + value;
                        System.out.printf("Valor final da compra: R$ %.2f", value);
                    }
                } else {
                    System.out.printf("Valor final da compra: R$ %.2f",value);
                }
            break;
            case 2:
                System.out.println("Débito selecionado: \n" +
                        "--------------------------------");

                discount = value * ((double) 5 / 100);
                value = value - discount;
                System.out.printf("Valor final da compra: R$ %.2f",value);
            break;
            case 3:
                System.out.println("Pix selecionado: \n" +
                        "--------------------------------");

                discount = value * ((double) 10 / 100);
                value = value - discount;
                System.out.printf("Valor final da compra: R$ %.2f",value);
            break;
            default:
                System.out.println("Opção invalída.");
        }
    }
}