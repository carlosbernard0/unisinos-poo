package aula06ArquivosEPersistenciaDeDados;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TerceiraAtividade {
    public static void main(String[] args) throws IOException {

        Pessoa igorGuilherme = new Pessoa();


        File arquivoPessoa = carregar("saida_com_dados.txt");
        Scanner inputDir = new Scanner(arquivoPessoa);
        Scanner inputConsole = new Scanner(System.in);

        igorGuilherme.setNome(inputDir.nextLine());
        igorGuilherme.setIdade(inputDir.nextLine());
        igorGuilherme.setAltura(inputDir.nextLine());
        igorGuilherme.setPeso(inputDir.nextLine());

        igorGuilherme.visualizar();

        System.out.println("Escolha seu novo peso:");
        igorGuilherme.setPeso(inputConsole.nextLine());
        salvar("saida_com_dados.txt", igorGuilherme);
        System.out.println("\n--\n");
        igorGuilherme.visualizar();





    }

    //Método para carregar o arquivo
    public static File carregar(String nomeArq){
        File arquivo = new File("C:\\Users\\Admin\\IdeaProjects\\unisinos-poo\\src\\aula06ArquivosEPersistenciaDeDados\\"+nomeArq);
        return arquivo;
    }

    public static void salvar(String nomeArq, Pessoa pessoa) throws IOException {
         File arquivo = new File("C:\\Users\\Admin\\IdeaProjects\\unisinos-poo\\src\\aula06ArquivosEPersistenciaDeDados\\"+nomeArq);


        FileWriter escreverNoArquivo = new FileWriter(arquivo, true);

        escreverNoArquivo.write(pessoa.getNome() + "\n");
        escreverNoArquivo.write(pessoa.getIdade() + "\n");
        escreverNoArquivo.write(pessoa.getAltura() + "\n");
        escreverNoArquivo.write(pessoa.getPeso() + "\n");
        escreverNoArquivo.close();
        System.out.println("Arquivo salvo!!");
    }
}
