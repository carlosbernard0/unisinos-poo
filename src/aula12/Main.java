package aula12;

public class Main {
    public static void main(String[] args) {
        Terrestre terrestre = new Terrestre(2008,1466,65,"Accord",4,4);
        Aereo aereo = new Aereo(2003,1500,50,"Jato",2,1);
        Aquatico aquatico = new Aquatico(2004,4000,40,"lancha",4,4);

        System.out.println(terrestre.info());
        System.out.printf("Consumo: %.2f Km/L%n",terrestre.consumo());
        System.out.printf("Autonomia: %.1f Km%n",terrestre.autonomia());
        System.out.println();
        System.out.println(aereo.info());
        System.out.printf("Consumo: %.2f Km/L%n",aereo.consumo());
        System.out.printf("Autonomia: %.1f Km%n",aereo.autonomia());
        System.out.println();
        System.out.println(aquatico.info());
        System.out.printf("Consumo: %.2f Km/L%n",aquatico.consumo());
        System.out.printf("Autonomia: %.1f Km%n",aquatico.autonomia());

    }
}
