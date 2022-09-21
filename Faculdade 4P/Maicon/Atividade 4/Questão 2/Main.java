import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        Carro car = new Carro();
        Moto mot = new Moto();
        int aux;
        String auxS = "";
        do {
            System.out.println("\n\n");
            System.out.println("Selecione de acordo com os numeros:");
            System.out.println("1- Cadastrar Carro");
            System.out.println("2- Cadastrar Moto");
            System.out.println("3- Exibir carro");
            System.out.println("4- Exibir Moto");
            System.out.println("5- Ligar e andar");
            System.out.println("0- Sair");
            System.out.print("Selecione -> ");
            op = entrada.nextInt();
            System.out.println("\n\n");
            entrada.nextLine();
            
            switch (op) {
                case 1:
                System.out.println("\n\n");
                    System.out.print("Qual a marca-> ");
                    auxS = entrada.nextLine();
                    car.setMarca(auxS);
                    System.out.print("Qual o modelo-> ");
                    auxS = entrada.nextLine();
                    car.setModelo(auxS);
                    System.out.print("Qual a cor-> ");
                    auxS = entrada.nextLine();
                    car.setCor(auxS);
                    System.out.print("Qual o ano-> ");
                    aux = entrada.nextInt();
                    car.setAno(aux);
                    System.out.print("Quantos cavalos-> ");
                    aux = entrada.nextInt();
                    car.setCavalos(aux);
                    System.out.println("\n\n");
                break;
                case 2:
                System.out.println("\n\n");
                    System.out.print("Qual a marca-> ");
                    auxS = entrada.nextLine();
                    mot.setMarca(auxS);
                    System.out.print("Qual o modelo-> ");
                    auxS = entrada.nextLine();
                    mot.setModelo(auxS);
                    System.out.print("Qual a cor-> ");
                    auxS = entrada.nextLine();
                    mot.setCor(auxS);
                    System.out.print("Qual o ano-> ");
                    aux = entrada.nextInt();
                    mot.setAno(aux);
                    System.out.print("Quantas cilindradas-> ");
                    aux = entrada.nextInt();
                    mot.setCilindradas(aux);
                    System.out.println("\n\n");
                break;
                case 3:
                System.out.println("\n\n");
                    System.out.println("Marca-> "+ car.getMarca());
                    System.out.println("Modelo-> "+ car.getModelo());
                    System.out.println("Cor-> "+ car.getCor());
                    System.out.println("Ano-> "+ car.getAno());
                    System.out.println("Cavalos-> "+ car.getCavalos());
                    System.out.println("\n\n");
                break;
                case 4:
                    System.out.println("\n\n");
                    System.out.println("Marca-> "+ mot.getMarca());
                    System.out.println("Modelo-> "+ mot.getModelo());
                    System.out.println("Cor-> "+ mot.getCor());
                    System.out.println("Ano-> "+ mot.getAno());
                    System.out.println("Cavalos-> "+ mot.getCilindradas());
                    System.out.println("\n\n");
                break;
                case 5:
                System.out.println("\n\n");
                    System.out.println("Qual deseja Locomover Moto(1) ou Carro(2)");
                    aux = entrada.nextInt();
                    if (aux == 1) {
                        mot.locomover();
                    } else {
                        car.locomover();
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
