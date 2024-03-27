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
    }
}
