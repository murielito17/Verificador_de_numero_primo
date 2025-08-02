import java.util.Scanner;

public class Verificador_de_numero_primo {
    public static void main(String []args){
        int num=0, pri=0;

        final String VERDE = "\u001B[32m";
        final String VERMELHO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = sc.nextInt();

            for (int i=1;i<=num;i++){
            if (num % i==0){
                System.out.printf(VERDE+" %d "+RESET,i);
                pri++;
            }else {
                System.out.printf(VERMELHO+" %d "+RESET,i);
            }
        }
            if (pri==2){
                System.out.printf("%nO numero %d, é um numero primo por ser Divisivel apenas duas vezes.",num);
            }else {
                System.out.printf("%nO numero %d não é primo, ele pode ser Divisivel um numero de %d vezes",num, pri);
            }
    }
}
