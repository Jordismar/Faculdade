import java.util.Random;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Personagem jogador;
        Personagem computador;
        Partida partida;
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int escolha;
        int escolhacomp;
        boolean fimJogo;

        System.out.println("Escolha seu personagem.");
        System.out.println("1- Claudinho.");
        System.out.println("2- Arrobinha.");
        System.out.println("3- TukTuk.");
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1:
                jogador = new PersonagemUm();
                break;
            case 2:
                jogador = new PersonagemDois();
                break;
            case 3:
                jogador = new PersonagemTres();
                break;
            default:
                jogador = new PersonagemDois();
                break;
        }

        do {
            escolhacomp = random.nextInt(4);
        } while (escolhacomp == escolha);

        switch (escolhacomp) {
            case 1:
                computador = new PersonagemUm();
                break;
            case 2:
                computador = new PersonagemDois();
                break;
            case 3:
                computador = new PersonagemTres();
                break;
            default:
                computador = new PersonagemUm();
                break;
        }

        partida = new Partida(jogador, computador);

        do {
            fimJogo = partida.round();
        } while (!fimJogo);

        entrada.close();
    }
}