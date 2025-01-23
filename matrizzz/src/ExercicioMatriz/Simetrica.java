package ExercicioMatriz;

import java.util.Scanner;

public class Simetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho da matriz
        System.out.print("Digite o tamanho da matriz NxN: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        // Lê os elementos da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verifica se a matriz é simétrica
        boolean simetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }

        // Exibe o resultado
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }
}
