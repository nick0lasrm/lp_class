public class Main {
    public static void main(String[] args) {
        int [][] matriz1 = {{2,4},
                            {6,8},
                            {10,12}};

        int [][] matriz2 = {{1,3},
                            {5,7}};

        int linhasMatriz1 = matriz1.length;
        int colunasMatriz1 = matriz1[0].length;
        int colunasMatriz2 = matriz2[0].length;

        int [][] matrizResultado = new int [linhasMatriz1][colunasMatriz2];

        for (int i=0;i<linhasMatriz1;i++){
            for (int j=0;j<colunasMatriz2;j++){
                for (int k=0;k<colunasMatriz1;k++){
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado: ");
        for (int i=0;i<matrizResultado.length;i++){
            for (int j=0;j<matrizResultado[0].length;j++){
                System.out.print(matrizResultado[i][j] + "\t");
            }
            System.out.println();
        }
     }
}