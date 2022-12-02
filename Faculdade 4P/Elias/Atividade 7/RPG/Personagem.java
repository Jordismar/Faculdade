import java.util.Random;

public abstract class Personagem implements IPersonagem {
    protected float energia;
    protected float forcaB;
    private Random random;

    public Personagem(float forcaB) {
        this.random = new Random();
        this.forcaB = forcaB;
        this.energia = 100;
    }

    public float getEnergia() {
        return this.energia;
    }

    public float ataque() {
        return this.forcaB * this.random.nextInt(101);
    }

    public float ataqueEspecial() {
        float dano;
        dano = this.forcaB * this.random.nextInt(101) * 1.02F;
        this.energia -= dano * 0.01;
        return dano;
    }

    public float defesaMagica() {
        return this.forcaB * this.random.nextInt(101);
    }

    public float defesa() {
        return this.forcaB * this.random.nextInt(101);
    }

    public float magia() {
        return this.forcaB * this.random.nextInt(101);
    }

    public void sofrer(float dano) {
        this.energia -= dano;
    };
}