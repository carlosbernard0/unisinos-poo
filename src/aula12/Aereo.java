package aula12;

public class Aereo extends Veiculo{
    private int qtdAsa;
    private int qtdMotor;

    public Aereo(int ano, int peso, float tanque, String modelo, int qtdAsa, int qtdMotor) {
        super(ano, peso, tanque, modelo);
        this.qtdAsa = qtdAsa;
        this.qtdMotor = qtdMotor;
    }

    @Override
    public String info(){
        return super.info()+", Quantidade de asas: "+ this.qtdAsa+", Quantidade de motores: "+ this.qtdMotor;
    }

    public int getQtdAsa() {
        return qtdAsa;
    }

    public void setQtdAsa(int qtdAsa) {
        this.qtdAsa = qtdAsa;
    }

    public int getQtdMotor() {
        return qtdMotor;
    }

    public void setQtdMotor(int qtdMotor) {
        this.qtdMotor = qtdMotor;
    }

    public float consumo(){
        return (float) (1/((getPeso()*0.00003)+(getQtdMotor()*0.01)));
    }

    public float autonomia(){
        return consumo()*getTanque();
    }
}
