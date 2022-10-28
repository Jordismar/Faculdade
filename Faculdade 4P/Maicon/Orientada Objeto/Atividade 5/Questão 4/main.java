import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        int op = 1;
        String palavra = "Pequeno";

        System.out.println("Indo adota um Poodle e um Pastor Alemao");
        System.out.println("Adotando o Poddle");
        System.out.println("Digite 1 para adotar o pequeno.");
        System.out.println("Digite 2 para adotar o medio.");
        op = entradas.nextInt();
        if (op == 2) {
            palavra = "Medio";
        }
        Poodle poodle = new Poodle(palavra);

        System.out.println("Adotando um Pastor Alemao");
        PastorAlemao pastorAlemao = new PastorAlemao();

        System.out.println("Deseja brincar com seus novos animais ?");
        while (op != 0) {
            System.out.println("Digite 1 - Para comecar a brincar com o Poodle.");
            System.out.println("Digite 2 - Para comecar a brincar com o Pastor Alemao.");
            System.out.println("Digite 0 - Para sair.");
            op = entradas.nextInt();
            switch (op) {
                case 1:
                    while (op != 0) {
                        System.out.println("O Poodle possuem varias habilidades interessantes.");
                        System.out.println("Digite 1 - Para Saltar.");
                        System.out.println("Digite 2 - Para Rolar.");
                        System.out.println("Digite 3 - Para Esconder.");
                        System.out.println("Digite 4 - Para Latir.");
                        System.out.println("Digite 5 - Para Brincar.");
                        System.out.println("Digite 0 - Para sair.");
                        op = entradas.nextInt();
                        switch (op) {
                            case 1:
                                poodle.saltar();
                                break;
                            case 2:
                                poodle.rolar();
                                break;
                            case 3:
                                poodle.esconder();
                                break;
                            case 4:
                                poodle.latir();
                                break;
                            case 5:
                                poodle.brincar();
                                break;
                            case 0:
                                System.out.println("Adeus Poodle.");
                                break;
                        }
                    }
                    op = 1;
                    break;
                case 2:
                    while (op != 0) {
                        System.out.println("O Pastor Alemao possuem varias habilidades interessantes.");
                        System.out.println("Digite 1 - Para Caçar.");
                        System.out.println("Digite 2 - Para Morder.");
                        System.out.println("Digite 3 - Para Farejas drogas.");
                        System.out.println("Digite 4 - Para Latir.");
                        System.out.println("Digite 5 - Para Brincar.");
                        System.out.println("Digite 0 - Para sair.");
                        op = entradas.nextInt();
                        switch (op) {
                            case 1:
                                pastorAlemao.caçar();
                                break;
                            case 2:
                                pastorAlemao.morder();
                                break;
                            case 3:
                                pastorAlemao.farejar();
                                break;
                            case 4:
                                pastorAlemao.latir();
                                break;
                            case 5:
                                pastorAlemao.brincar();
                                break;
                            case 0:
                                System.out.println("Adeus Pastor Alemao.");
                                break;
                        }
                    }
                    op = 1;
                    break;
                case 0:
                    System.out.println("Adeus cães.");
                    break;
            }
        }
        entradas.close();
    }
}