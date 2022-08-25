import java.util.Scanner;

public class formula {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int x = 0;

        System.out.print("Informe um valor para x -> ");
        x = entrada.nextInt();
        int i;
        int n = 0;
        if (x != 0) {
            for (i = 0; i <= x;i++) {
                n += i;
            }
            System.out.println("N = "+ n);
        }else{
            System.out.println("N = "+ n);
        }
    }
}
