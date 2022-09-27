public class Agenda {
    public Pessoa[] p;
    public int aux;

    public Agenda(int tamVet) {
        p = new Pessoa[tamVet];
        aux = 0;
    }

    public void setP(Pessoa p, int posicao) {
        this.p[posicao] = p;
    }

    public void imprimePessoa(int posicao) {
        if (p[posicao] != null) {
            System.out.println("============================");
            System.out.println("Pessoa [" + posicao + "]");
            System.out.println("============================");
            System.out.println("Nome ->" + p[posicao].getNome());
            System.out.println("Idade ->" + p[posicao].getIdade());
            System.out.println("Altura ->" + p[posicao].getAltura());
        }
    }

    public void imprimeVetorPessoa(int quantP) {
        if (quantP == 0) {
            System.out.println("============================");
            System.out.println("So existe esta Pessoa");
            System.out.println("============================");
            imprimePessoa(0);
        } else {
            for (int i = 0; i < quantP; i++) {
                imprimePessoa(i);
            }
        }
    }

    public int buscaPessoa(String nome, int quantP) {
        for (int i = 0; i < quantP; i++) {
            if (nome == p[i].getNome()) {
                aux = i;
            }
        }
        return aux;
    }

    public int retirarPessoa(String nome, int quantP) {

        aux = buscaPessoa(nome, quantP);
        if (quantP == 0) {
            p[0] = null;
        } else {
            for (int i = 0; i < quantP; i++) {
                if (aux >= i && p[aux + 1] != null) {
                    p[aux] = p[aux + 1];
                }
            }
            quantP--;
        }
        return quantP;
    }
}
