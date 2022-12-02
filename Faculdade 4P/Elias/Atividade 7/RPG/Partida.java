import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Personagem jogador;
    private Personagem computador;
    private Scanner entrada;
    private Random random;
    private int op;
    private float dano;
    private float ataque;
    private float defesa;
    private float round;

    public Partida(Personagem jogador, Personagem computador) {
        this.jogador = jogador;
        this.computador = computador;
        this.round = 0;
        this.entrada = new Scanner(System.in);
        this.random = new Random();
    }

    public void atacar(boolean computador) {
        if (!computador) {
            System.out.println("1- Ataque Comum");
            System.out.println("2- Ataque Especial");
            System.out.println("3- Ataque Magico");
            this.op = this.entrada.nextInt();

            switch (this.op) {
                case 1:
                    this.ataque = this.jogador.ataque();
                    return;
                case 2:
                    this.ataque = this.jogador.ataqueEspecial();
                    return;
                case 3:
                    this.ataque = this.jogador.magia();
                    return;
                default:
                    this.ataque = this.jogador.ataque();
                    return;
            }
        }
        this.op = this.random.nextInt(3);

        switch (this.op) {
            case 1:
                this.ataque = this.computador.ataque();
                return;
            case 2:
                this.ataque = this.computador.ataqueEspecial();
                return;
            case 3:
                this.ataque = this.computador.magia();
                return;
            default:
                this.ataque = this.computador.ataque();
                return;
        }
    }

    public void defender(boolean computador) {

        if (!computador) {
            System.out.println("1- Defesa Comum");
            System.out.println("2- Defesa Magico");
            this.op = this.entrada.nextInt();
            switch (this.op) {
                case 1:
                    this.defesa = this.jogador.defesa();
                    return;
                case 2:
                    this.defesa = this.jogador.defesaMagica();
                    return;
                default:
                    this.defesa = this.jogador.defesa();
                    return;
            }
        }
        this.op = this.random.nextInt(3);

        switch (this.op) {
            case 1:
                this.defesa = this.computador.defesa();
                return;
            case 2:
                this.defesa = this.computador.defesaMagica();
                return;
            default:
                this.defesa = this.computador.defesa();
                return;
        }
    }

    public boolean round() {
        this.round += 1;
        System.out.println("\nRound " + this.round);

        if (this.round % 2 == 1) {
            this.atacar(false);
            this.defender(true);
            if (this.ataque > this.defesa) {
                this.dano = this.ataque - this.defesa;
                this.computador.sofrer(this.dano);
            }
        } else {
            this.atacar(true);
            this.defender(false);
            if (this.ataque > this.defesa) {
                this.dano = this.ataque - this.defesa;
                this.jogador.sofrer(this.dano);
            }
        }
        System.out.println("\nAtaque de -> " + this.ataque);
        System.out.println("Defesa de -> " + this.defesa);
        System.out.println("Dano de -> " + this.dano);
        System.out.println("\nEnergia do jogador -> " + this.jogador.getEnergia());
        System.out.println("Energia do computador -> " + this.computador.getEnergia());
        this.ataque = 0;
        this.defesa = 0;
        this.dano = 0;

        return this.vencedor();
    }

    public boolean vencedor() {

        if (this.computador.getEnergia() <= 0) {
            System.out.println("Vitoria do Jogador");
            return true;
        }
        if (this.jogador.getEnergia() <= 0) {
            System.out.println("Vitorio do Computador");
            return true;
        }

        return false;
    }
}