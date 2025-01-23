package ExercicioMatriz;

import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do vetor de 10 elementos
        int[] vetor = new int[10];

        // Lê os elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Inverte a ordem dos elementos no vetor
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio < fim) {
            // Troca os elementos
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            // Move os índices para o próximo par de elementos
            inicio++;
            fim--;
        }

        // Exibe o vetor invertido
        System.out.println("Vetor invertido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
