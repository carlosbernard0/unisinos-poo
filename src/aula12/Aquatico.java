package aula12;

public class Aquatico extends Veiculo {
    private int qtdMotor;
    private int qtdConves;

    public Aquatico(int ano, int peso, float tanque, String modelo, int qtdMotor, int qtdConves) {
        super(ano, peso, tanque, modelo);
        this.qtdMotor= qtdMotor;
        this.qtdConves = qtdConves;
    }

    @Override
    public String info(){
        return super.info()+", Quantidade de motores: "+ this.qtdMotor+", Quantidade de conves: "+ this.qtdConves;
    }

    public int getQtdMotor() {
        return qtdMotor;
    }

    public void setQtdMotor(int qtdMotor) {
        this.qtdMotor = qtdMotor;
    }

    public int getQtdConves() {
        return qtdConves;
    }

    public void setQtdConves(int qtdConves) {
        this.qtdConves = qtdConves;
    }

    public float consumo(){
        return (float) (1/((getPeso()*0.00002)+(getQtdMotor()*0.02)));
    }

    public float autonomia(){
        return consumo()*getTanque();
    }
}
