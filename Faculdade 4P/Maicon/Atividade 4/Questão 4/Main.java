import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Alemao ale = new Alemao();
        Poodle poo = new Poodle();
        int aux;
        String auxS = "";
        do {
            System.out.println("\n\n");
            System.out.println("Selecione de acordo com os numeros:");
            System.out.println("1- Poodle Latir");
            System.out.println("2- Pastor Alemão Ltir");
            System.out.println("3- Exibir especificações");
            System.out.println("4- Gerenciar Cães");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            System.out.println("\n");
            entrada.nextLine();
            
            switch (op) {
                case 1:
                System.out.println("\n");
                    System.out.print("Informe o nome do Poodle-> ");
                    auxS = entrada.nextLine();
                    poo.setNome(auxS);
                    System.out.print("Como é o Temperamento dele(a)-> ");
                    auxS = entrada.nextLine();
                    poo.setTemperamento(auxS);
                    System.out.print("Como é o Olfato dele(a)-> ");
                    auxS = entrada.nextLine();
                    poo.setOlfato(auxS);
                    System.out.print("Qual o Tamanho dele(a)-> ");
                    auxS = entrada.nextLine();
                    poo.setTamanho(auxS);
                    System.out.println("\n\n");
                break;
                case 2:
                System.out.println("\n");
                    System.out.print("Informe o nome do Pastor Alemão-> ");
                    auxS = entrada.nextLine();
                    ale.setNome(auxS);
                    System.out.print("Como é o Temperamento dele(a)-> ");
                    auxS = entrada.nextLine();
                    ale.setTemperamento(auxS);
                    System.out.print("Como é o Olfato dele(a)-> ");
                    auxS = entrada.nextLine();
                    ale.setOlfato(auxS);
                    System.out.print("Qual o Tamanho dele(a)-> ");
                    auxS = entrada.nextLine();
                    ale.setTamanho(auxS);
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
