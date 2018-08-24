import java.util.Scanner;
public class imc {
 public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite seu peso");
        double peso = tcl.nextDouble();
        System.out.println("digite sua altura");
        double altura = tcl.nextDouble();
        double imc = (peso/(altura*altura) );
        System.out.println("seu imc é "+ imc);
    }    
}
