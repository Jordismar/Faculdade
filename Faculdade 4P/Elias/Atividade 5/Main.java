import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        Velho velho = new Velho();
        Novo novo = new Novo();

        do {
            System.out.println("1-Selecionar Imovel Novo");
            System.out.println("2-Selecionar Imovel Velho");
            System.out.println("3-Exibir valor do Imovel Velho");
            System.out.println("4-Exibir valor do Imovel Novo");
            System.out.println("0-Sair");
            System.out.print("Selecione-> ");
            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("| Selecionou um Imovel Novo |");
                    System.out.println("-----------------------------");
                    System.out.println("Qual o endereço do Imovel Novo:");
                    novo.setEndereco(entrada.nextLine());
                    System.out.println("Informe o valor do Imovel:");
                    novo.setValor(entrada.nextFloat());
                    novo.calcula(getValor());
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("| Selecionou um Imovel Velho |");
                    System.out.println("-----------------------------");
                    System.out.println("Qual o endereço do Imovel Velho:");
                    velho.setEndereco(entrada.nextLine());
                    System.out.println("Informe o valor do Imovel:");
                    velho.setValor(entrada.nextFloat());
                    velho.calcula(getValor());
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("| Selecionou um Imovel Novo |");
                    System.out.println("-----------------------------");
                    System.out.printf("Valor Final com os impostos Por Novo-> ", novo.getAcrescimo());
                    break;
                case 4:
                    System.out.println("-----------------------------");
                    System.out.println("| Selecionou um Imovel Velho |");
                    System.out.println("-----------------------------");
                    System.out.printf("Valor Final com os Descontos Por Velho-> ", velho.getDesconto());
                    break;
                default:
                    System.out.println("Selecione Corretamentes");
                    break;
            }
        } while (op != 0);
    }

    private static float getValor() {
        return 0;
    }
}
