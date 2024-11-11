import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Jogo da Velha");
        System.out.print("Nome do Jogador 1:");
        String jogador1 = input.nextLine();
        System.out.print("Nome do Jogador 2:");
        String jogador2 = input.nextLine();
        System.out.println("Nova Partida: " + jogador1 + " vs " + jogador2);

    }
    public static char receberCaractere (char a, char b) {

        return 0;
    }
    public static char rodada (char a, char b) {
        char[][] velha1 = new char[3][3];
        char[][] velha2 = new char[3][3];

        do {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    System.out.print(velha1[i][j]);
                }
            }
        } while ();
        return 0;
    }
}