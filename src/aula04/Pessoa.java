package aula04;

public class Pessoa {
    private String nome;
    private Sexo sexo;
    private CorOlhos corOlhos;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Sexo sexo, CorOlhos corOlhos) {
        this.nome = nome;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
    }

    public Pessoa(String nome, Sexo sexo, CorOlhos corOlhos, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.sexo = sexo;
        this.corOlhos = corOlhos;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa geraPessoa(String nome, Sexo sexo, Pessoa pai){
        if (this.sexo == Sexo.F){
            if (pai.getSexo().equals("H")){

                return new Pessoa(nome,sexo,corDosOlhosNovaPessoa(pai.corOlhos,corOlhos),pai, Pessoa.this);

            }else {
                System.out.println("O Pai nao é Homem");
                return null;
            }

        }else {
            System.out.println("Você "+getSexo()+" não consegue gerar uma pessoa");
            return null;
        }
    }

    public CorOlhos corDosOlhosNovaPessoa(CorOlhos corOlhosPai, CorOlhos corOlhosMae){
        if (corOlhosPai==CorOlhos.V && corOlhosMae ==CorOlhos.C || corOlhosPai==CorOlhos.C && corOlhosMae ==CorOlhos.V || corOlhosPai==CorOlhos.A && corOlhosMae ==CorOlhos.C|| corOlhosPai==CorOlhos.C && corOlhosMae ==CorOlhos.A || corOlhosPai==CorOlhos.C && corOlhosMae ==CorOlhos.C ){
            return CorOlhos.C;
        }else if (corOlhosPai==CorOlhos.V && corOlhosMae ==CorOlhos.A || corOlhosPai==CorOlhos.A && corOlhosMae ==CorOlhos.V || corOlhosPai==CorOlhos.V && corOlhosMae ==CorOlhos.V ){
            return CorOlhos.V;
        }else {
            return CorOlhos.A;
        }
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setCorOlhos(CorOlhos corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return String.valueOf(sexo);
    }

    public String getCorOlhos() {
        return String.valueOf(corOlhos);
    }

    public void imprimirDados(){
        System.out.println("Seus dados: ");
        System.out.printf("Nome: %s", getNome());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Cor dos Olhos: " + getCorOlhos());
        if (pai != null && mae != null){
            System.out.println("Nome do pai: " + pai.getNome());
            System.out.println("Nome da Mãe: " + mae.getNome());
        }

    }
}
