
import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double saldo = 0, depositar = 0, sacar = 0;
        int a = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("1- sacar");
            System.out.println("2- depositar");
            System.out.println("3- saldo ");
            System.out.println("4- sair");
            System.out.println(" digite o que deseja");
            a = t.nextInt();

            switch (a) {

                case 1:
                    System.out.println("quanto voce deseja sacar R$?");
                    sacar = t.nextInt();
                    saldo = saldo - sacar;
                    break;

                case 2:
                    System.out.println("voce quer depositar quanto?");
                    depositar = t.nextDouble();
                    saldo = saldo + depositar;
                    break;

                case 3:
                    System.out.println("seu saldo é de R$"+ saldo);
                    break;
                    

                case 4:
                    System.out.println("obrigado pela confiança!!! xauuuu!!!!");
                    i = 10;
                    break;
            }
        }

    }

}
