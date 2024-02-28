package fundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizDimensoes {
    public static <matriz> void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][6];

        ArrayList numerosPares = new ArrayList();
        ArrayList numerosImpares = new ArrayList();

        //pedindo para informar os valores da linha 1
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um numero para a linha "+ (i+1));
            matriz[0][i] = input.nextInt();
        }

        // adicionando os valores inveros da linha 1 na linha 2
        for (int i = 0; i < 6; i++) {
            matriz[1][i] =  matriz[0][5-i];
        }

        //adicionando os valores da linha 1 e 2 na linha 3
        for (int i = 0; i < 6; i++) {
            matriz[2][i] = matriz[1][i] + matriz[0][i];
        }

        // achar os numeros pares e impares e adicionar no ArrayList
        for (int i = 0; i < 6; i++) {
            if (matriz[0][i] %2== 0){
                numerosPares.add(matriz[0][i]);
            }else {
                numerosImpares.add(matriz[0][i]);
            }
        }

        // adicionar na quarta linha os valore, primeiro pares depois impares
        for (int i = 0; i < numerosPares.size(); i++) {
            matriz[3][i] = (int) numerosPares.get(i);
        }
        for (int i = 0; i < numerosImpares.size(); i++) {
            matriz[3][i+numerosPares.size()] = (int) numerosImpares.get(i);
        }

        // mostrando a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
