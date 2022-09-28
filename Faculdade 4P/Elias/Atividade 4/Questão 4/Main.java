import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        int aux = 0;
        TV tv = new TV();
        Controle controle = new Controle(tv);
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println(
                    "Canal Atual -> " + tv.getCanal() + " Com " + tv.getVolume()
                            + " Volume atual");
            System.out.println("Selecione a opção que deseja executar");
            System.out.println("1- Aumentar Volume");
            System.out.println("2- Diminuir Volume");
            System.out.println("3- Aumentar Canal");
            System.out.println("4- Diminuir Canal");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    if (tv.getVolume() == 100) {
                        System.out.println("Ultimo Volume já");
                    } else {
                        System.out.println("Aumentando...");
                        controle.aumentarVolume(tv);
                    }
                    break;
                case 2:
                    if (elevador.getAndar() == 0) {
                        System.out.println("Você já esta no Terreo");
                    } else {
                        System.out.println("Descendo...");
                        elevador.diminuiAndar();
                    }
                    break;
                case 3:
                    if (elevador.getQuantPessoa() == elevador.getLota()) {
                        System.out.println("Esta lotado");
                    } else {
                        System.out.println("Adicionando...");
                        elevador.aumentarQuantPessoa();
                    }
                    break;
                case 4:
                    if (elevador.getQuantPessoa() == 0) {
                        System.out.println("O elevador esta vazio");
                    } else {
                        System.out.println("Saindo...");
                        elevador.diminuiQuantPessoa();
                    }
                    break;
                default:
                    System.out.println("=========================");
                    System.out.println("Selecione Corretamente");
                    System.out.println("=========================");
                    System.out.println("\n");
                    break;
            }
        } while (op != 0);
    }
}
