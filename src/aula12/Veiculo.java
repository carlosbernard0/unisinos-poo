package aula12;

public class Veiculo {
    private int ano;
    private int peso;
    private float tanque;
    private String modelo;

    public Veiculo(int ano, int peso, float tanque, String modelo) {
        this.ano = ano;
        this.peso = peso;
        this.tanque = tanque;
        this.modelo = modelo;
    }

    public String info(){
        return "Ano: "+this.ano+", Peso: "+this.peso+", Tanque: "+this.tanque+", Modelo: "+this.modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getTanque() {
        return tanque;
    }

    public void setTanque(float tanque) {
        this.tanque = tanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
