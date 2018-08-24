
import java.util.Scanner;

public class diasdevida {
 public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        int anos , meses , dias ,totalDias , totalHoras , totalMinutos , totalSegundos;
        System.out.println("quantos anos de vida vc tem?");
        anos = tcl.nextInt();
        System.out.println("quantos meses de vida você tem?");
        meses = tcl.nextInt();
        System.out.println("quantos dias de vida você tem?");
        dias = tcl.nextInt();
        anos = anos* 365;
        meses = meses*30;
        totalDias = anos + meses + dias;
        totalHoras = totalDias*24;
        totalMinutos = totalHoras*60;
        totalSegundos = totalMinutos*60;
        System.out.println("voce ja viveu "+ totalSegundos+" segundos");
        }
    }    

