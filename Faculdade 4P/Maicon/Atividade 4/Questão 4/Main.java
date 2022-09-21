import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Alemao ale = new Alemao();
        Poodle poo = new Poodle();
        int aux;
        int auxOp = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Selecione de acordo com os numeros:");
            System.out.println("1- Poodle Latir");
            System.out.println("2- Pastor Alemão Latir");
            System.out.println("3- Exibir especificações");
            System.out.println("4- Interagir com Cães");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            System.out.println("\n");
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\n");
                    poo.latir();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    ale.latir();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Deseja Exibir do Pastor Alemão(1) ou do Poodle(2)");
                    aux = entrada.nextInt();
                    if (aux == 1) {
                        System.out.println("Temperamento do Pastor Alemão-> " + ale.getTemperamento());
                        System.out.println("Tamanho do Pastor Alemão-> " + ale.getTamanho());
                        System.out.println("Olfato do Pastor Alemão-> " + ale.getOlfato());
                        System.out.println("\n");
                    } else {
                        System.out.println("Temperamento do Poodle-> " + poo.getTemperamento());
                        System.out.println("Tamanho do Poodle-> " + poo.getTamanho());
                        System.out.println("Olfato do Poodle-> " + poo.getOlfato());
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("Deseja interagir com Pastor Alemão(1) ou com Poodle(2)");
                    aux = entrada.nextInt();
                    if (aux == 1) {
                        do {
                            System.out.println("Selecione de acordo com os numeros:");
                            System.out.println("1- Caçar");
                            System.out.println("2- Morder");
                            System.out.println("3- Farejar Drogas");
                            System.out.println("0- Voltar");
                            auxOp = entrada.nextInt();
                            System.out.println("\n");
                            switch (auxOp) {
                                case 1:
                                    ale.cacar();
                                    System.out.println("\n");
                                    break;
                                case 2:
                                    ale.morder();
                                    System.out.println("\n");
                                    break;
                                case 3:
                                    ale.farejarDrogas();
                                    System.out.println("\n");
                                    break;
                                default:
                                    System.out.println("\n");
                                    System.out.println("Selecione corretamente");
                                    System.out.println("\n");
                                    break;
                            }
                        } while (auxOp != 0);
                    } else {
                        do {
                            System.out.println("Selecione de acordo com os numeros:");
                            System.out.println("1- Saltar");
                            System.out.println("2- Rolar");
                            System.out.println("3- Esconder");
                            System.out.println("0- Voltar");
                            System.out.print("Selecione -> ");

                            auxOp = entrada.nextInt();
                            System.out.println("\n");
                            switch (auxOp) {
                                case 1:
                                    poo.saltar();
                                    System.out.println("\n");
                                    break;
                                case 2:
                                    poo.rolar();
                                    System.out.println("\n");
                                    break;
                                case 3:
                                    poo.esconder();
                                    System.out.println("\n");
                                    break;
                                default:
                                    System.out.println("\n");
                                    System.out.println("Selecione corretamente");
                                    System.out.println("\n");
                                    break;
                            }
                        } while (auxOp != 0);
                    }
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Selecione corretamente");
                    System.out.println("\n");
                    break;
            }
        } while (op != 0);
    }
}
