package aula02.impostoderenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ImpostoDeRendaSimplificado pessoa = new ImpostoDeRendaSimplificado();

        System.out.print("Qual é seu nome:");
        pessoa.setNomeDoContribuinte(input.nextLine());
        System.out.print("Digite o ano de nascimento:");
        pessoa.setAnoDeNascimento(input.nextInt());

        System.out.println("Seu nome: "+ pessoa.getNomeDoContribuinte() + " com a idade de "+ pessoa.getIdade()+ " anos");

        input.nextLine();
        System.out.println("Qual é sua profissão?");
        pessoa.setProfissao(input.nextLine());
        System.out.println("Sua escolaridade: ");
        pessoa.setEscolariadade(input.nextLine());

        System.out.println("Sua profissao --> " + pessoa.getProfissao());
        System.out.println("Sua escolaridade --> " + pessoa.getEscolariadade());


        System.out.println("Qual é sua renda mensal");
        pessoa.setRendaMensal(input.nextInt());
        System.out.println("Quantos dependentes você tem?");
        pessoa.setNumeroDeDependentes(input.nextInt());
        System.out.println("Sua renda anual é de R$ " + pessoa.getRendaAnual());
        System.out.println("Sua renda mensal per capita é R$ "+ pessoa.getRendaPerCapitaMensal());
        System.out.println("Sua alíquota maxima é de R$ "+pessoa.getAliquotaIRMaxima());

        System.out.println("Com seus "+pessoa.getNumeroDeDependentes()+" dependentes, sua alíquota efetiva fica R$ " + pessoa.getAliquotaIREfetiva());



    }
}
