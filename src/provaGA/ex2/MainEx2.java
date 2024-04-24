package provaGA.ex2;

import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá seja muito bem vindo!");
        System.out.println("Vamos fazer a criação de um album agora...");

        System.out.println("Primeiro digite um nome para seu album: ");
        String nomeAlbum = input.nextLine();

        System.out.println("Quantas musicas vai ter nele: ");
        Integer qntdMusicas = input.nextInt();

        System.out.println("Qual é o ano de lancamento:");
        Integer anoLancamento = input.nextInt();
        input.nextLine();

        System.out.println("E qual é o nome do Cantor ou Banda:");
        String nomeCantorOuBanda = input.nextLine();

        Album album = new Album(nomeAlbum,qntdMusicas,anoLancamento,nomeCantorOuBanda);

        String opcao;
        do {
            System.out.println("Adicionar musica ao album? S ou N");
            opcao = input.nextLine();
            if (opcao.equalsIgnoreCase("S")) {

                System.out.println("Digite o nome da musica:");
                String nomeMusica = input.nextLine();

                System.out.println("Digite a quantidade de segundos que a musica possue:");
                Integer qntdSegundos = input.nextInt();
                input.nextLine();

                album.adicionarMusica(nomeMusica,qntdSegundos);
            }
        }while (!opcao.equalsIgnoreCase("N"));

        System.out.println("Agora vou mostrar a duracao do album em segundos, minutos e horas");
        album.imprimirDuracaoTotal();


        System.out.println("Seu album:"+album.getNomeAlbum());
        System.out.println("Possui: " +album.getQntdMusicas()+" musicas");
        System.out.println("Foi ou vai ser lançado no ano: " +album.getAnoLancamento());
        System.out.println("O cantor ou banda é: " +album.getCantorOuBanda());
        System.out.println("Possui musicas: ");
        for (int i = 0; i < album.getListaDeMusicas().size(); i++) {
            System.out.print(album.getListaDeMusicas().get(i).getNomeMusica()+" com "+album.getListaDeMusicas().get(i).getDuracaoEmSegundos()+" segundos\n");
        }
        System.out.println("Sua duração total é de "+album.getDuracaoTotalSeg()+" segundos");



    }
}
