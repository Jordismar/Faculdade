public class Pessoa {
    private String nome;
    private int idade;
    private boolean cadastra;

    public Pessoa(){
        nome = "";
        idade = 0;
        cadastra = false;
    }

    public String getNome(){
       return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public boolean getCadastra(){
        return this.cadastra;
    }
    public void setNome(String nome){
         this.nome = nome;
    }
    public void setIdade(int idade){
         this.idade = idade;
    }
    public void setCadastra(boolean cadastra){
        this.cadastra = cadastra;
    }

    public void imprime(){
        System.out.println("Nome -> "+ this.nome);
        System.out.println("Idade -> "+ this.idade);
        if (cadastra) {
            System.out.println("Cadastrado");
        }else{
            System.out.println("Não cadastrado");
        }

    }
}

