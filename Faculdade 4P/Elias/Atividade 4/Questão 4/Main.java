import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        int aux = 0;
        TV tv = new TV();
        Controle controle = new Controle(tv);
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n");
            System.out.println("Canal Atual -> " + tv.getCanal() + " Com " + tv.getVolume() + " Volume atual");
            System.out.print("\n");
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
                    System.out.println("\n");
                    break;
                case 2:
                    if (tv.getVolume() == 0) {
                        System.out.println("Volume já esta no minimo");
                    } else {
                        System.out.println("Diminuindo...");
                        controle.diminuirVolume(tv);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    if (tv.getCanal() == 100) {
                        System.out.println("Ultimo Canal disponivel");
                    } else {
                        System.out.println("Aumentando...");
                        controle.aumentarCanal(tv);
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    if (tv.getCanal() == 1) {
                        System.out.println("Primeiro Canal");
                    } else {
                        System.out.println("Diminuindo...");
                        controle.diminuirCanal(tv);
                    }
                    System.out.println("\n");
                    break;

            }
        } while (op != 0);
    }
}
