import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Executavel exe = new Executavel();
        Editavel edit = new Editavel();
        int aux;
        String auxS = "";
        do {
            System.out.println("\n\n");
            System.out.println("Selecione de acordo com os numeros:");
            System.out.println("1- Cadastrar Executavel");
            System.out.println("2- Exibir editavel");
            System.out.println("3- Gerenciar Arquivos");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            System.out.println("\n");
            entrada.nextLine();
            
            switch (op) {
                case 1:
                System.out.println("\n");
                    System.out.print("O que executar no painel-> ");
                    auxS = entrada.nextLine();
                    exe.setPainel(auxS);
                    System.out.println("\n\n");
                break;
                case 2:
                System.out.println("\n\n");
                    System.out.print(edit.getPainel());
                    System.out.println("\n\n");
                break;
                case 3:
                System.out.println("\n\n");
                    System.out.println("Deseja Exibir Cadastravel(1) ou Editar Editavel(2)");
                    aux = entrada.nextInt();
                    if (aux == 1) {
                        exe.gerenciar();
                    } else {
                        edit.gerenciar();
                    }
                    System.out.println("\n\n");
                break;
                default:
                System.out.println("\n\n");
                System.out.println("Selecione corretamente");
                System.out.println("\n\n");
                    break;
            }
        } while (op != 0);
    }
}
