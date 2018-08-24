import java.util.Scanner;
public class loja {
public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite o valor do produto");
        double preço = tcl.nextDouble();
        double parcela = (preço/5);
        System.out.print("você pagará "+parcela+" em cada parcela");
    }
        
}
