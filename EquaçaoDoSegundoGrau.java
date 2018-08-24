import java.util.Scanner;
public class EquaçaoDoSegundoGrau {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        System.out.println("digite o valor de 'a'");
        int a = tcl.nextInt();
        System.out.println("digite o valor de 'b'");
        int b = tcl.nextInt();
        System.out.println("digite o valor de 'c'");
        int c = tcl.nextInt();
        int delta = (b*b)- 4*a*c;
        System.out.println("o delta é"+ delta);
        
        int x1 =(-b -(delta^(1/2)))/(2*a);
        System.out.println("o x1 é" + x1);
        int x2 =(-b +(delta^(1/2)))/(2*a);
        System.out.println("o x2 é" + x2);
        if (a > 0) {
            System.out.println("a aparbola será com cavidade pra cima");
            
        } else{
            System.out.println("a parabola será com cavidade pra baixo");
        }
        
    }
    
}
