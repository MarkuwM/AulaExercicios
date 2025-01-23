package ExercicioMatriz;

import java.util.Scanner;

public class MatrizMaximo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas e colunas da matriz
        System.out.print("Digite o número de linhas (N): ");
        int n = scanner.nextInt();

        System.out.print("Digite o número de colunas (M): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        // Lê os elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Inicializa a variável para o valor máximo e sua posição
        int valorMaximo = matriz[0][0];
        int linhaMaximo = 0;
        int colunaMaximo = 0;

        // Procura o valor máximo e sua posição
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] > valorMaximo) {
                    valorMaximo = matriz[i][j];
                    linhaMaximo = i;
                    colunaMaximo = j;
                }
            }
        }

        // Exibe o resultado
        System.out.println("Valor máximo: " + valorMaximo);
        System.out.println("Posição: Linha " + linhaMaximo + ", Coluna " + colunaMaximo);

        scanner.close();
    }
}
