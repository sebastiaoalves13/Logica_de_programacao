
import java.util.Scanner;

public class booblesort {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aux, i;
        System.out.println("digite o tamanho do seu vetor");
        i = tcl.nextInt();
        int v[] = new int[i];
        System.out.println("digite os números que deseja colocar no seu vetor");

        for (int j = 0; j < v.length; j++) {
            v[j] = tcl.nextInt();
        }

        for (int k = 0; k < v.length; k++) {
            for (int j = 0; j < v.length; j++) {
                if (v[k] < v[j]) {
                    aux = v[j];
                    v[j] = v[k];
                    v[k] = aux;
                }
            }

        }

        for (int j = 0; j < v.length; j++) {
            System.out.print(v[j]);
        }
    }

}
