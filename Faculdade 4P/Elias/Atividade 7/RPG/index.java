import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int op = 0;
        String nickname = new String();
        int personagem = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("1- START");
            System.out.println("0- SAIR");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();
            entrada.nextLine();
        } while (op != 0);
        switch (op) {
            case 1:
                do {
                    
                    System.out.println("Selecione o seu Personagem:");
                    System.out.println("1- Sentinela Prateado");
                    System.out.println("2- Dr.Frank");
                    System.out.println("3- Lord UmDoisTres");
                    System.out.print("Selecione-> ");
                    personagem = entrada.nextInt();
                    
                    System.out.println("Seu Inimigo (Computador Random)");
                    // IniciarBatalha
                    System.out.print("Deseja Jogar Novamente ? Sim(1) Não(0) -> ");
                    op = entrada.nextInt();
                } while (op != 0);
                break;
        
            default:
            System.out.println("\n");
            System.out.println("Informe uma opção valida");
            System.out.println("\n");
                break;
        }
    }
}
