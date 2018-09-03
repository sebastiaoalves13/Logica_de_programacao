
import java.util.Scanner;

public class CaixaMetodos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0, deposito = 0, saque = 0;
        String usuario;
        boolean sair = false;
        CaixaMetodos obj = new CaixaMetodos();

        while(true) {
            obj.Menu();
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    obj.Saldo(saldo);
                    break;
                case 2:
                    saldo = obj.Saque(saldo, saque);
                    break;
                case 3:
                    saldo = obj.Deposito(saldo, deposito);
                    break;
                case 4:
                    obj.Sair();
                    break;
                default:
                    System.out.println("Valor inválido!");
            }
        }
    }

    public void Saldo(double saldo) {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public double Saque(double saldo, double saque) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do saque: R$");
        saque = entrada.nextDouble();
        saldo = saldo - saque;
        return saldo;
    }

    public double Deposito(double saldo, double deposito) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: R$");
        deposito = entrada.nextDouble();
        saldo = saldo + deposito;
        return saldo;
    }

    public void Sair() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja realmente sair?(S/N)");
        String escolha = entrada.next();
        if ("S".equals(escolha)) {
            System.exit(0);
        }
    }

    public void Menu() {
        System.out.println("CAIXA ELETRÔNICO:");
        System.out.println("1 - SALDO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPÓSITO");
        System.out.println("4 - SAIR");
    }
}
