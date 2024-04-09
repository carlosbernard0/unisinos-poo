package aula06ArquivosEPersistenciaDeDados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SegundaAtividade {

    public static void main(String[] args) throws FileNotFoundException {
        File arquivo = new File("C:\\Users\\Admin\\IdeaProjects\\unisinos-poo\\src\\aula06ArquivosEPersistenciaDeDados\\saida_com_dados.txt");
        Scanner input = new Scanner(arquivo);

        String nome = input.nextLine();
        String idade = input.nextLine();
        String altura= input.nextLine();
        String peso = input.nextLine();


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);



    }


}
