package aula06ArquivosEPersistenciaDeDados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimeiraAtividade {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = input.nextLine();

        System.out.println("Seu sexo: M/F");
        String sexoStr = input.nextLine();
        char sexoChar = sexoStr.charAt(0);

        System.out.println("Qual é sua idade?");
        int idade = input.nextInt();

        System.out.println("Qual é sua altura?");
        float altura = input.nextFloat();

        System.out.println("Qual é seu peso?");
        float peso = input.nextFloat();

        input.close();
        // pegar o arquivo do diretorio
        File saidaTemp = new File("C:\\Users\\Admin\\IdeaProjects\\unisinos-poo\\src\\aula06ArquivosEPersistenciaDeDados\\saida_com_dados.txt");

        FileWriter escreverNoArquivo = new FileWriter(saidaTemp, true);

        escreverNoArquivo.write( nome + "\n");
        escreverNoArquivo.write(idade + "\n");
        escreverNoArquivo.write(altura + "\n");
        escreverNoArquivo.write(peso + "\n");
        escreverNoArquivo.close();


    }
}
