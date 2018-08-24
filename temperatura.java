import java.util.Scanner;
public class temperatura {
public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite a temperatura em graus celsios");
         double celsios = tcl.nextDouble();
         double fahrenheit = (9*celsios+160)/5;
         System.out.println("A temperatura em fahrenheit é "+fahrenheit);
        
    }    
}
