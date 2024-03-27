package aula04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa mae = new Pessoa("Rosemary",Sexo.F,CorOlhos.C);
        Pessoa pai = new Pessoa("Doglas",Sexo.H,CorOlhos.C);

        Pessoa pessoa1 = mae.geraPessoa("Carlos",Sexo.H,pai);
        Pessoa pessoa2= mae.geraPessoa("Carlos",Sexo.H,pai);

        mae.imprimirDados();
        pai.imprimirDados();
        pessoa1.imprimirDados();

        pessoa2.pessoasIguais(pessoa1);
        mae.verificarPessoasIrmas(pessoa1, pessoa2);


        pessoa1.verificarSeEAntecessora(mae);


    }
}
