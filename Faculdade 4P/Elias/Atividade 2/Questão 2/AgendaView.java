import java.util.Scanner;
public class AgendaView {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        int posi = 0;
        Pessoa pp;
        Agenda agenda = new Agenda(10);
        do {
        System.out.println("Agenda cabe 10 pessoas");
        System.out.println("1-Adicionar nova Pessoa a Agenda");
        System.out.println("2-Imprimir Agenda completa");
        System.out.println("0-Sair");
        System.out.print("Informe a opção valida -> ");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                pp = new Pessoa();
                System.out.println("Nova pessoa:");
                System.out.println("\n");
                System.out.print("Nome -> ");
                pp.setNome(entrada.nextLine());
                System.out.print("Idade -> ");
                pp.setIdade(entrada.nextInt());
                pp.setCadastra(true);
                agenda.setVetor(pp, posi++);

            break;
            case 2:
            for( Pessoa p: agenda.getVetor() ){
                p.imprime();
            }
            
            break;

            default:
            System.out.println("Informe uma opção valida");
            break;
        }
        } while (op != 0);
    }
}
