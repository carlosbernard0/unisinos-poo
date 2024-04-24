package provaGA.ex2;

public class Musica {
    private String nomeMusica;
    private Integer duracaoEmSegundos;

    public Musica(String nomeMusica, Integer duracaoEmSegundos) {
        this.nomeMusica = nomeMusica;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public Integer getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(Integer duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }
}
