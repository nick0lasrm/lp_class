public class Main {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6,7,8,9,10};
        int [] vetor2 = new int [9];

        for(int i=0;i<vetor.length;i++){
        vetor2[i] = vetor[9-i];
            System.out.println(vetor2[i]);
        }

    }
}