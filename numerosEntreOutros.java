
import java.util.Scanner;

public class numerosEntreOutros {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("digite um número");
        int a = tcl.nextInt();
        System.out.println("digite outro número");
        int b = tcl.nextInt();
        if (a > b) {
            System.out.print("os numeros entre eles sao ");
            for (int i = b; b < a;) {
                System.out.print(b + 1 +",");
                ++b;
               
            }
        } else if (a < b) {
            System.out.print("os numeros entre eles sao " );
            for (int i = a; a < b;) {
                System.out.print(a + 1 +",");
                ++a;
              

            }

        }
    }

}
