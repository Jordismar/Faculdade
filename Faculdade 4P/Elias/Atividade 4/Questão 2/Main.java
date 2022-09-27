import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        int quantP = 0;
        String aux = "";
        Pessoa p;
        int tamVet = 10;
        Agenda a = new Agenda(tamVet);
        do {
            System.out.println("\n");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Exibir agenda completa");
            System.out.println("3- Exibir Pessoa");
            System.out.println("4- Remover uma Pessoa");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            entrada.nextLine();
            System.out.println("\n");
            int i = 0;
            switch (op) {
                case 1:
                    p = new Pessoa();
                    System.out.print("Nome-> ");
                    p.setNome(entrada.nextLine());
                    System.out.print("Idade-> ");
                    p.setIdade(entrada.nextInt());
                    System.out.print("Altura-> ");
                    p.setAltura(entrada.nextFloat());
                    a.setP(p, quantP);
                    quantP++;
                    System.out.println("\n");
                    break;
                case 2:
                    a.imprimeVetorPessoa(quantP);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Informe a posicao da pessoa ->");
                    i = entrada.nextInt();
                    a.imprimePessoa(i);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Informe o nome de quem deseja exluir:");
                    aux = entrada.nextLine();
                    quantP = a.retirarPessoa(aux, quantP);

                    break;
                default:
                    System.out.println("Selecione Corretamente\n");
                    System.out.println("\n");
                    break;
            }
        } while (op != 0);
    }
}
