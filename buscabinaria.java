
import java.util.Scanner;

public class buscabinaria {

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
        System.out.println("qual numero voc~e deseja procurar?");
        int procurado = tcl.nextInt();
        int metade = v[v.length / 2];

        if (metade < procurado) {
            while (metade < procurado) {
                metade++;
            }
            if (metade != procurado) {
                System.out.println("valor nao encontrado");

            }
            if (metade == procurado) {
                System.out.println("valor encontado!!!");
                System.out.print(metade);
                System.out.println("na posição"+ v[metade]);

            }

        } else if (v[v.length / 2] > procurado) {
            while (v[v.length / 2] > procurado) {
                v[v.length / 2]--;

            }
            if (v[v.length / 2] != procurado) {
                System.out.println("valor nao encontrado");

            }
            if (v[v.length / 2] == procurado) {
                System.out.println("valor encontado!!!");
                System.out.print(v[v.length / 2]);
                System.out.println("na posição"+ (v[v.length / 2]--));

            }

        }
    }
}
