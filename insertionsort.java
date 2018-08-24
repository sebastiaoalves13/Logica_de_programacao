
import java.util.Scanner;

public class insertionsort {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aux, i;
        System.out.println("digete a quantidade de posições do seu vetor");
        int o = tcl.nextInt();
        int v[] = new int[o];
        System.out.println("digite os números que deseja colocar no seu vetor");
        for (int j = 0; j < v.length; j++) {
            v[j] = tcl.nextInt();
        }
        for (i = 1; i < v.length; i++) {
            aux = v[i];
            int j = i;
            while ((j > 0) && (v[j - 1] > aux)) {
                v[j] = v[j - 1];
                j -= 1;
            }
            v[j] = aux;

        }
        for (int k = 0; k < v.length; k++) {
            System.out.println(v[k] + ",");

        }

    }
}
