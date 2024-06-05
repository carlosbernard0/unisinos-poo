package aula12;

public class Terrestre extends Veiculo{
    private int qtdRoda;
    private int qtdPorta;

    public Terrestre(int ano, int peso, float tanque, String modelo,int qtdRoda, int qtdPorta) {
        super(ano, peso, tanque, modelo);
        this.qtdRoda = qtdRoda;
        this.qtdPorta = qtdPorta;
    }

    @Override
    public String info(){
        return super.info()+", Quantidade de rodas: "+ this.qtdRoda+", Quantidade de portas: "+ this.qtdPorta;
    }

    public int getQtdRoda() {
        return qtdRoda;
    }

    public void setQtdRoda(int qtdRoda) {
        this.qtdRoda = qtdRoda;
    }

    public int getQtdPorta() {
        return qtdPorta;
    }

    public void setQtdPorta(int qtdPorta) {
        this.qtdPorta = qtdPorta;
    }

    public float consumo(){
        return (float) (1/((getPeso()*0.00005)+(getQtdRoda()*0.005)));
    }

    public float autonomia(){
        return consumo()*getTanque();
    }


}
