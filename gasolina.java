import java.util.Scanner;
public class gasolina {
public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        double litros , quilometros;
        System.out.println("digite o numero de quilometros percorridos");
        quilometros = tcl.nextDouble();
         System.out.println("digite o numero de litros de combustivel gastos");
        litros = tcl.nextDouble();
         double total =(quilometros/litros);
         System.out.print("voce gastou "+total+"  litros por cada km percorrido");
        
    }    
}
