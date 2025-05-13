public class Main {
    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3, 4, 5},
                            {5, 4, 3, 2, 1},
                            {6, 7, 8, 9, 10},
                            {10, 9, 8, 7, 6},
                            {11, 12, 13, 14, 15}};

        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i][i]);
        }
    }
}