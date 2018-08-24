import java.util.Scanner;
public class numeroMaior {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        System.out.println("digite um numero");
        int a = tcl.nextInt();
        System.out.println("digite outro numero");
        int b = tcl.nextInt();
        if (a< b) {
            System.out.println(b + " é o maior");
            
        }else if (a> b) {
            System.out.println(a + " é o maior");
            
        }
        if (a==b) {
            System.out.println("os dois sao iguais");
            
        }
        
    }
    
}
