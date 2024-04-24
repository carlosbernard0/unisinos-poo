package provaGA.ex1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoMenu = -1;
        ArrayList<Material> listaDeMateriais = new ArrayList<>();


        do {
            System.out.println("Bem vindo ao almoxarifado");
            System.out.println("Selecione alguma das opcoes:");
            System.out.println("""
                    1) Depositar material
                    2) Retirar material
                    3) Abastecer material
                    4) Mudar nome do material
                    5) Mostrar dados do material
                    6) Mostrar lista de produtos em estoque
                    """);
            opcaoMenu = input.nextInt();
            switch (opcaoMenu){
                case 0:
                    break;
                case 1:
                    System.out.println("Qual é o codigo numérico do material: ");
                    Integer codNumerico = input.nextInt();
                    input.nextLine();
                    System.out.println("Qual é o nome do material: ");
                    String nomeMaterial = input.nextLine();
                    System.out.println("Qual é a quantidade de materiais(saldo): ");
                    Integer saldoQntd = input.nextInt();
                    input.nextLine();

                    Material material = new Material(codNumerico,nomeMaterial,saldoQntd);
                    listaDeMateriais.add(material);

                    System.out.println("provaGA.ex1.Material "+nomeMaterial+" adicionado!");
                    break;
                case 2:
                    Material materialEncontrado = new Material();
                    input.nextLine();
                    System.out.println("Qual é o nome do material?");
                    String nomeDoMaterialProcurado = input.nextLine();
                    for (int i = 0; i < listaDeMateriais.size(); i++) {
                        if (Objects.equals(listaDeMateriais.get(i).getNomeMaterial(), nomeDoMaterialProcurado)){
                             materialEncontrado = listaDeMateriais.get(i);
                             listaDeMateriais.remove(i);
                        }
                    }
                    System.out.println("provaGA.ex1.Material "+materialEncontrado.getNomeMaterial() +" possui saldo de: "+materialEncontrado.getSaldoQntd());
                    System.out.println("Escolhe a quantidade a ser retirada: ");
                    int qntdSaldoRetirado = input.nextInt();
                    materialEncontrado.setSaldoQntd(materialEncontrado.getSaldoQntd()-qntdSaldoRetirado);

                    System.out.println("Pronto saldo atual de "+materialEncontrado.getSaldoQntd());
                    System.out.println();
                    listaDeMateriais.add(materialEncontrado);
                    break;
                case 3:
                    Material material1 = new Material();
                    input.nextLine();
                    System.out.println("Qual é o nome do material?");
                    String nomeDoMaterialProcurado1 = input.nextLine();
                    for (int i = 0; i < listaDeMateriais.size(); i++) {
                        if (Objects.equals(listaDeMateriais.get(i).getNomeMaterial(), nomeDoMaterialProcurado1)){
                            material1 = listaDeMateriais.get(i);
                            listaDeMateriais.remove(i);
                        }
                    }
                    System.out.println("provaGA.ex1.Material "+material1.getNomeMaterial() +" possui saldo de: "+material1.getSaldoQntd());
                    System.out.println("Escolhe a quantidade a ser atribuido: ");
                    int qntdSaldoAbastecido = input.nextInt();
                    material1.setSaldoQntd(material1.getSaldoQntd()+qntdSaldoAbastecido);

                    System.out.println("Pronto saldo atual de "+material1.getSaldoQntd());
                    System.out.println();
                    listaDeMateriais.add(material1);
                    break;
                case 4:
                    Material materialPorNome = new Material();
                    input.nextLine();
                    System.out.println("Qual é o nome do material?");
                    String nomeASerProcurado = input.nextLine();
                    for (int i = 0; i < listaDeMateriais.size(); i++) {
                        if (Objects.equals(listaDeMateriais.get(i).getNomeMaterial(), nomeASerProcurado)){
                            materialPorNome = listaDeMateriais.get(i);
                            listaDeMateriais.remove(i);
                        }
                    }
                    System.out.println("Qual é o novo nome que você deseja colocar");
                    String nomeNovo = input.nextLine();
                    materialPorNome.setNomeMaterial(nomeNovo);
                    System.out.println("Nome redefinido...");
                    listaDeMateriais.add(materialPorNome);
                    break;
                case 5:
                    Material materialDados = new Material();
                    input.nextLine();
                    System.out.println("Qual é o nome do material?");
                    String nomeParaDados = input.nextLine();
                    for (int i = 0; i < listaDeMateriais.size(); i++) {
                        if (Objects.equals(listaDeMateriais.get(i).getNomeMaterial(), nomeParaDados)){
                            materialDados = listaDeMateriais.get(i);
                        }
                    }
                    System.out.println("Seu codigo numerico é: "+materialDados.getCodigoNumerico());
                    System.out.println("O nome do material é: "+ materialDados.getNomeMaterial());
                    System.out.println("Seu saldo é: "+ materialDados.getSaldoQntd());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Materiais em estoque: ");
                    for (int i = 0; i < listaDeMateriais.size(); i++) {
                        if (listaDeMateriais.get(i).getSaldoQntd() > 0){
                            System.out.print("provaGA.ex1.Material -> "+listaDeMateriais.get(i).getNomeMaterial()+", ");
                            System.out.print("seu codigo numerico: "+listaDeMateriais.get(i).getCodigoNumerico()+", ");
                            System.out.print("seu saldo: "+listaDeMateriais.get(i).getSaldoQntd()+"\n");
                        }

                    }
            }

        }while (opcaoMenu!=0);
    }
}
