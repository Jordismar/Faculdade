import java.util.Scanner;
public class tabuada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Informe um numero -> ");
        num = entrada.nextInt();
        int i = 0;
        int mult = 0;
        while (i <= 10) {
            mult = num * i;
            System.out.println(num+" x " + i + " = " + mult);
            i++;
        }
    }
    
}
