package aula05exercicios;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Continente {
    private String nomeContinente;

    private ArrayList<Pais> listaDePaises = new ArrayList<>();



    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public ArrayList<Pais> getListaDePaises() {
        return listaDePaises;
    }

    public void setListaDePaises(ArrayList<Pais> listaDePaises) {
        this.listaDePaises = listaDePaises;
    }

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
    }

    public void adicionarPaisNoContinente(Pais pais){
        listaDePaises.add(pais);
        System.out.println(pais.getNome()+" adicionado no Continente "+getNomeContinente());
    }

    public Integer dimensaoDoContinente(){
        int dimensaoTotalDoContinente = 0;
        for (int i = 0; i < getListaDePaises().size(); i++) {
            dimensaoTotalDoContinente += getListaDePaises().get(i).getDimensao();
        }
        return dimensaoTotalDoContinente;
    }

    public Integer populacaoDoContinente(){
        int populacaoTotalDoContinente = 0;
        for (int i = 0; i < getListaDePaises().size(); i++) {
            populacaoTotalDoContinente += getListaDePaises().get(i).getPopulacao();
        }
        return populacaoTotalDoContinente;
    }

    public Integer densidadePopulacionalDoContinente(){
        Integer densidade = populacaoDoContinente() / dimensaoDoContinente();
        System.out.println(getNomeContinente()+" possui "+densidade+ " habitantes/km2");
        return densidade;
    }

    //f) Um método que retorne o país com maior população no continente;
    public Pais paisComMaiorPopulacao(){
        int maiorPopulacao = 0;
        int numeroPaisMaisPopuloso = -1;
        for (int i = 0; i < getListaDePaises().size(); i++) {
            if(maiorPopulacao < getListaDePaises().get(i).getPopulacao()){
                maiorPopulacao = getListaDePaises().get(i).getPopulacao();
                numeroPaisMaisPopuloso = i;
            };
        }
        return getListaDePaises().get(numeroPaisMaisPopuloso);
    }

    //g) Um método que retorne o país com menor população no continente;
    public Pais paisComMenorPopulacao(){
        int menorPopulacao = 200000000;
        int numeroPaisMenosPopuloso = -1;
        for (int i = 0; i < getListaDePaises().size(); i++) {
            if(getListaDePaises().get(i).getPopulacao()<menorPopulacao){
                menorPopulacao = getListaDePaises().get(i).getPopulacao();
                numeroPaisMenosPopuloso = i;
            };
        }
        return getListaDePaises().get(numeroPaisMenosPopuloso);
    }

    //h) Um método que retorne o país de maior dimensão territorial no continente;
    public Pais paisComMaiorDimensao(){
        int maiorDimensao = 0;
        int numeroDoPaisComMaiorDimensao= -1;
        for (int i = 0; i < listaDePaises.size(); i++) {
            if (listaDePaises.get(i).getDimensao()>maiorDimensao){
                maiorDimensao = listaDePaises.get(i).getDimensao();
                numeroDoPaisComMaiorDimensao = i;
            };
        }
        return listaDePaises.get(numeroDoPaisComMaiorDimensao);
    }


    //i) Um método que retorne o país de menor dimensão territorial no continente;
    public Pais paisComMenorDimensao(){
        int menorDimensao = 900000000;
        int numeroDoPaisComMaiorDimensao= -1;
        for (int i = 0; i < listaDePaises.size(); i++) {
            if (listaDePaises.get(i).getDimensao()<menorDimensao){
                menorDimensao = listaDePaises.get(i).getDimensao();
                numeroDoPaisComMaiorDimensao = i;
            };
        }
        return listaDePaises.get(numeroDoPaisComMaiorDimensao);
    }

    //j) Um método que retorne a razão territorial do maior país em relação ao menor país.
    public Double razaoTerritorialMaiorEMenor(){
        double dimensaoDoMaior = paisComMaiorDimensao().getDimensao();
        double dimensaoDoMenor = paisComMenorDimensao().getDimensao();

        return dimensaoDoMaior/dimensaoDoMenor;
    }

}
