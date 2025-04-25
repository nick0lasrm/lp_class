 public class Main {
    public static void main(String[] args) {
        // Declaração com inicialização
        int [] numbers = {0,6,5,2,1};

        // Percorrer vetor com for
        for(int i=0; i<numbers.length; i++)
            System.out.println(numbers[i]);

        // Percorrer vetor com foreach
        for(int pointer:numbers){
            System.out.println(pointer);
        }
    }
}