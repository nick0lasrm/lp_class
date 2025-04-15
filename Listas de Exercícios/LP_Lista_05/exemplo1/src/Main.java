public class Main {
    public static void main(String[] args) {
        // Declaração sem inicialização
        int [] numbers1 = new int [5];
        numbers1[0] = 0;
        numbers1[1] = 6;
        numbers1[2] = 5;
        numbers1[3] = 2;


        // Declaração com inicialização
        int [] numbers2 = {0,6,5,2,1};

        numbers1[4] = numbers2[4];

        System.out.println(numbers1[1]);
        System.out.println(numbers2[1]);
    }
}