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
}
