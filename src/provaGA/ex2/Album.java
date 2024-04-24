package provaGA.ex2;

import java.util.ArrayList;

public class Album {
    private String nomeAlbum;
    private Integer qntdMusicas;
    private Integer anoLancamento;
    private String cantorOuBanda;
    private ArrayList<Musica> listaDeMusicas = new ArrayList<>();
    private Integer duracaoTotalSeg = 0;

    public Album(String nomeAlbum, Integer qntdMusicas, Integer anoLancamento, String cantorOuBanda) {
        this.nomeAlbum = nomeAlbum;
        this.qntdMusicas = qntdMusicas;
        this.anoLancamento = anoLancamento;
        this.cantorOuBanda = cantorOuBanda;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public Integer getQntdMusicas() {
        return qntdMusicas;
    }

    public void setQntdMusicas(Integer qntdMusicas) {
        this.qntdMusicas = qntdMusicas;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCantorOuBanda() {
        return cantorOuBanda;
    }

    public void setCantorOuBanda(String cantorOuBanda) {
        this.cantorOuBanda = cantorOuBanda;
    }

    public ArrayList<Musica> getListaDeMusicas() {
        return listaDeMusicas;
    }

    public void setListaDeMusicas(ArrayList<Musica> listaDeMusicas) {
        this.listaDeMusicas = listaDeMusicas;
    }

    public Integer getDuracaoTotalSeg() {
        return duracaoTotalSeg;
    }

    public void setDuracaoTotalSeg(Integer duracaoTotalSeg) {
        this.duracaoTotalSeg = duracaoTotalSeg;
    }

    public void adicionarMusica(String nomeMusica, Integer duracaoMusicaEmSeg){
        int musicasQuePodemSerAdicionadas = this.qntdMusicas-this.listaDeMusicas.size();
        if (musicasQuePodemSerAdicionadas >0 ){
            Musica musica = new Musica(nomeMusica,duracaoMusicaEmSeg);
            this.listaDeMusicas.add(musica);
            this.duracaoTotalSeg += duracaoMusicaEmSeg;
            System.out.println("Musica adicionada...");
            System.out.println("Você ainda pode adicionar "+(qntdMusicas-listaDeMusicas.size())+" musicas");
        }else {
            System.out.println("Quantidade de musicas excedida");
        }

    }

    public void imprimirDuracaoTotal(){
        int duracaoEmSegundos = this.duracaoTotalSeg;
        System.out.println("A duracao total em segundos é de "+duracaoEmSegundos+" segundos");
        double duracaoEmMinutos = (double) duracaoEmSegundos /60;
        System.out.printf("A duracao total em minutos é de %.1f minutos%n",duracaoEmMinutos);
        double duracaoEmHoras = duracaoEmMinutos/60;
        System.out.printf("A duracao total em horas é de %.1f horas%n   ",duracaoEmHoras);
        System.out.println();
    }
}
