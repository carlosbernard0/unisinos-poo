package fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizDimensoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        int matriz[][] = new int[4][6];

        for (int i = 0; i < 4 ; i++) {
            System.out.print("Digite o valor da linha [" + i + "]: ");
            matriz[i][0] = input.nextInt();
        }

        for (int i = 0; i < 4; i++){
            matriz[i][1] = matriz[3-i][0];
        }

        for (int i = 0; i < 4; i++) {
            matriz[i][2] = matriz[i][0] + matriz[i][1];
        }

        for (int i = 0; i < 4; i++) {
            if (matriz[i][0]%2 == 0){
                numerosPares.add(matriz[i][0]);
            }
        }

        for (int i = 0; i < 4; i++) {
            if (matriz[i][0]%2 != 0){
                numerosImpares.add(matriz[i][0]);
            }
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < numerosPares.size(); j++) {

                // FINALIZAR

            }

        }
    }
}
