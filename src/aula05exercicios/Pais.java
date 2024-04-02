package aula05exercicios;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Objects;

public class Pais {
    private String codigoISO;
    private String nome;
    private Integer populacao;
    private Integer dimensao;
    private ArrayList<String> paisesFronteira;

    public ArrayList<String> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(ArrayList<String> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }

    public Pais(String codigoISO, String nome, Integer dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Integer getDimensao() {
        return dimensao;
    }

    public void setDimensao(Integer dimensao) {
        this.dimensao = dimensao;
    }



    public void mesmoPais(Pais seuPais, Pais paisAVerificar){
        if (Objects.equals(seuPais.getCodigoISO(), paisAVerificar.getCodigoISO())){
            System.out.println("É o mesmo país!");
        }else {
            System.out.println("Não é o mesmo país!");
        }
    }

    public void paisLimitrofe(Pais pais){
        boolean encontrou = false;
        for (int i = 0; i < pais.getPaisesFronteira().size(); i++) {
            if (Objects.equals(pais.getPaisesFronteira().get(i),getNome())){
                System.out.println(getNome()+" faz fronteira com o " + pais.getNome());
                encontrou = true;
            }
        }
        if (encontrou == false){
            System.out.println("Desculpa mas seu pais não faz fronteira!");
        }

    }

    public void densidadePopulacional(){
        Integer populacao = getPopulacao();
        Integer dimensao = getDimensao();
        System.out.println(getNome()+" possui "+populacao/dimensao+ " habitantes/km2");

    }

    public void paisesFronteirasEmComum(Pais pais){
        ArrayList listaDosPaisesEmComum = new ArrayList();

        for (int i = 0; i < getPaisesFronteira().size(); i++) {
            for (int j = 0; j < pais.getPaisesFronteira().size(); j++) {
                if (getPaisesFronteira().get(i) == pais.getPaisesFronteira().get(j)){
                    listaDosPaisesEmComum.add(getPaisesFronteira().get(i));
                }
            }
        }
        System.out.println(getNome()+" e "+pais.getNome()+" tem os paises em comum: "+ listaDosPaisesEmComum);
    }


    @Override
    public String toString() {
        return nome;
    }
}
