public class Main {
    public static void main(String[] args) {
        int maiorLinha = Integer.MIN_VALUE;
        int maiorColuna = Integer.MIN_VALUE;
        int somaLinhas = 0;
        int somaCol = 0;
        int col = 0;

        int [][] matriz = {{1, 2, 3, 4, 5},
                            {5, 4, 3, 2, 1},
                            {6, 7, 8, 9, 10},
                            {10, 9, 8, 7, 6},
                            {11, 12, 13, 14, 15}};

        for(int linha=0;linha< matriz.length;linha++){
            somaLinhas = 0;
           for(col=0;col<matriz[0].length;col++){
               somaLinhas += matriz[linha][col];
                somaCol += matriz[col][linha];
            }
            if (somaLinhas > maiorLinha){
                maiorLinha = somaLinhas;
            }
            if (somaCol > maiorColuna){
                maiorColuna = somaCol;
            }
        }
        System.out.println(maiorColuna);
        System.out.println(maiorLinha);
    }
}