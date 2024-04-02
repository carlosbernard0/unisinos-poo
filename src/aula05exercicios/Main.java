package aula05exercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8514876);
        brasil.setPopulacao(203062512);

        Pais uruguai = new Pais("URY", "Uruguai",176215 );
        uruguai.setPopulacao(3426000);

        Pais argentina = new Pais("ARG", "Argentina", 2780000);
        argentina.setPopulacao(45810000);

        //Setando paises que fazem fronteira com Brasil
        ArrayList<String> paisesFronteiraBrasil = new ArrayList<>();
        Collections.addAll(paisesFronteiraBrasil, "Uruguai","Argentina","Paraguai", "Bolívia", "Peru", "Colômbia", "Venezuela", "Guiana", "Suriname" );
        brasil.setPaisesFronteira(paisesFronteiraBrasil);

        //Setando paises que fazem fronteira com Uruguai
        ArrayList<String> paisesFronteiraUruguai = new ArrayList<>();
        Collections.addAll(paisesFronteiraUruguai, "Brasil","Argentina");
        uruguai.setPaisesFronteira(paisesFronteiraUruguai);

        ArrayList<String> paisesFronteiraArgentina = new ArrayList<>();
        Collections.addAll(paisesFronteiraArgentina, "Paraguai","Bolívia","Brasil","Uruguai","Chile");
        argentina.setPaisesFronteira(paisesFronteiraArgentina);

        brasil.densidadePopulacional();
        brasil.mesmoPais(brasil,argentina);
        brasil.paisLimitrofe(argentina);
        brasil.paisesFronteirasEmComum(uruguai);
        brasil.paisesFronteirasEmComum(argentina);

        argentina.paisesFronteirasEmComum(uruguai);

        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPaisNoContinente(brasil);
        americaDoSul.adicionarPaisNoContinente(argentina);
        americaDoSul.adicionarPaisNoContinente(uruguai);
        System.out.println();
        System.out.println("Dimensão total do continente é de "+ americaDoSul.dimensaoDoContinente()+" Km2");
        System.out.println("A População total do continente é de "+ americaDoSul.populacaoDoContinente() +" pessoas");
        americaDoSul.densidadePopulacionalDoContinente();
        System.out.println();

        System.out.println("O pais mais populoso do continente: "+americaDoSul.paisComMaiorPopulacao()+" com "+americaDoSul.paisComMaiorPopulacao().getPopulacao()+" habitantes");
        System.out.println("O pais menos populoso do continente: "+americaDoSul.paisComMenorPopulacao()+" com "+americaDoSul.paisComMenorPopulacao().getPopulacao()+" habitantes");

        System.out.println();
        System.out.println("O pais a maior dimensao territorial do continente: "+americaDoSul.paisComMaiorDimensao()+" com "+americaDoSul.paisComMaiorDimensao().getDimensao()+" Km2");
        System.out.println("O pais a menor dimensao territorial do continente: "+americaDoSul.paisComMenorDimensao()+" com "+americaDoSul.paisComMenorDimensao().getDimensao()+" Km2");
        System.out.println();
        System.out.printf("A razao dos dois paises Maior e Menor é de %.2f Km2",americaDoSul.razaoTerritorialMaiorEMenor());


    }
}
