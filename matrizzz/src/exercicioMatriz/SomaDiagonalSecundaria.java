package exercicioMatriz;

import java.util.Scanner;

public class SomaDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de uma matriz 4x4
        int[][] matriz = new int[4][4];

        // Lê os elementos da matriz 4x4
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonalSecundaria += matriz[i][3 - i];  // Posição da diagonal secundária
        }

        // Exibe o resultado
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
