import java.util.Scanner;
public class frete {
public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double kmrodado;
        System.out.println("digete o número de km quadrados");
        kmrodado = tcl.nextDouble();
        double valorTotal = (kmrodado*1.50)+ 9;
        System.out.println("voce devera pagar "+valorTotal);
    }
        
}
