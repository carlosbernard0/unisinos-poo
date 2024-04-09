package aula06ArquivosEPersistenciaDeDados;

public class Pessoa {

    // vars
    private String nome;
    private String idade;
    private String altura;
    private String peso;

    // métodos
    public void visualizar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
    }

    // construtores


    public Pessoa() {}

    public Pessoa(String nome, String idade, String altura, String peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // getters & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
