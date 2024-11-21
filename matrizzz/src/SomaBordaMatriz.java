import java.util.Scanner;

public class SomaBordaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de linhas e colunas da matriz (NxN)
        System.out.print("Digite o número de linhas e colunas (N): ");
        int n = scanner.nextInt();

        // Cria a matriz NxN
        int[][] matriz = new int[n][n];

        // Lê os elementos da matriz NxN
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos elementos da borda
        int somaBorda = 0;

        // Soma os elementos da primeira linha
        for (int j = 0; j < n; j++) {
            somaBorda += matriz[0][j];
        }

        // Soma os elementos da última linha
        for (int j = 0; j < n; j++) {
            somaBorda += matriz[n - 1][j];
        }

        // Soma os elementos da primeira e última coluna (excluindo as já somadas)
        for (int i = 1; i < n - 1; i++) {
            somaBorda += matriz[i][0];  // Primeira coluna
            somaBorda += matriz[i][n - 1];  // Última coluna
        }

        // Exibe o resultado
        System.out.println("Soma dos elementos da borda: " + somaBorda);

        scanner.close();
    }
}
