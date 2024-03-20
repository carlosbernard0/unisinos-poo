package aula02.impostoderenda;

import java.time.LocalDate;

public class ImpostoDeRendaSimplificado {
    private String nomeDoContribuinte;
    private int anoDeNascimento;
    private String profissao;
    private String escolariadade;
    private int rendaMensal;
    private int numeroDeDependentes;

    public int getIdade() {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int age = anoAtual - anoDeNascimento;
        return age;
    }

    public int getRendaAnual(){
        return this.rendaMensal*12;
    }

    public int getRendaPerCapitaMensal(){
        return this.rendaMensal /this.numeroDeDependentes;
    }

    public double getAliquotaIRMaxima(){
        if (rendaMensal > 1900 && rendaMensal <= 2820) {
            return  (rendaMensal*0.075)*12;
        } else if (rendaMensal > 2820 && rendaMensal <= 3740) {
            return  (rendaMensal*.15)*12;
        } else if (rendaMensal > 3740 && rendaMensal <= 4660) {
            return  (rendaMensal*0.225)*12;
        } else if (rendaMensal > 4660) {
            return  (rendaMensal*0.275)*12;
        }else {
            return 0;
        }
    }

    public double getAliquotaIREfetiva(){
        for (int i = 0; i < numeroDeDependentes; i++) {
            rendaMensal-=190;

        }
        return getAliquotaIRMaxima();
    }



    public String getNomeDoContribuinte() {
        return nomeDoContribuinte;
    }

    public void setNomeDoContribuinte(String nomeDoContribuinte) {
        this.nomeDoContribuinte = nomeDoContribuinte;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEscolariadade() {
        return escolariadade;
    }

    public void setEscolariadade(String escolariadade) {
        this.escolariadade = escolariadade;
    }

    public int getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(int rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }
}
