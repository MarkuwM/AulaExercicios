package exercicioMatriz;

import java.util.Scanner;

public class MultiplicarMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas (N) e colunas (M)
        System.out.print("Digite o número de linhas (N): ");
        int n = scanner.nextInt();

        System.out.print("Digite o número de colunas (M): ");
        int m = scanner.nextInt();

        // Cria a matriz NxM
        int[][] matriz = new int[n][m];

        // Lê os elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Lê o número pelo qual a matriz será multiplicada
        System.out.print("Digite o número inteiro para multiplicar os elementos da matriz: ");
        int multiplicador = scanner.nextInt();

        // Multiplica todos os elementos da matriz pelo número informado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] *= multiplicador;
            }
        }

        // Exibe a matriz resultante
        System.out.println("Matriz resultante após multiplicação:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
