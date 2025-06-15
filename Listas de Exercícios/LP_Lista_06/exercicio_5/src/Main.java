import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.println("Array utilizado: " + Arrays.toString(numeros));

        System.out.println("\nDigite o número que deseja buscar no array: ");
        int alvo = in.nextInt();

        int indice = buscaBinaria(numeros, alvo);

        if (indice != -1) {
            System.out.println("Elemento " + alvo + " encontrado na posição: " + indice);
        } else {
            System.out.println("-1");
        }

    }

    public static int buscaBinaria(int[] array, int elementoBuscado) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == elementoBuscado) {
                return meio;
            }

            if (elementoBuscado < array[meio]) {
                direita = meio - 1;
            }
            else {
                esquerda = meio + 1;
            }
        }
        return -1;
    }
}