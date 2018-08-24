import java.util.Scanner;
public class trocadevalores {
public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
        int a = tcl.nextInt();
        int b = tcl.nextInt();
        int aux ;
        aux = a;
        a = b;
        b = aux;
        System.out.println(a);
        System.out.println(b);
        
    }
        
}
