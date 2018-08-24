import java.util.Scanner;
public class vendedor {
 public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome= tcl.nextLine();
        System.out.println("digite seu salario fixo");
        double salarioFixo = tcl.nextDouble();
        System.out.println("digite em reais o valor das vendas que você acumulou este mês");
        double vendasMensais = tcl.nextDouble();
        double porcentagem = (vendasMensais*15)/100+(salarioFixo);
        System.out.println("Seu nome é "+ nome);
        System.out.println("Seu salario fixo é "+ salarioFixo);
        System.out.println("Seu salario total este mes é "+ porcentagem);
       
        
        
    }    
}
