package provaGA.ex1;

public class Material {

    private Integer codigoNumerico;
    private String nomeMaterial;
    private Integer saldoQntd;

    public Material(){

    }
    public Material(Integer codigoNumerico, String nomeMaterial, Integer saldoQntd) {
        this.codigoNumerico = codigoNumerico;
        this.nomeMaterial = nomeMaterial;
        this.saldoQntd = saldoQntd;
    }

    public Integer getCodigoNumerico() {
        return codigoNumerico;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public Integer getSaldoQntd() {
        return saldoQntd;
    }

    public void setSaldoQntd(Integer saldoQntd) {
        this.saldoQntd = saldoQntd;
    }
}
