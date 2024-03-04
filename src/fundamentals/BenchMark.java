package fundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BenchMark {
    static String[] linguagem = new String[7];
    static Double[] memoria = new Double[7];
    static Integer[] cpu = new Integer[7], tempo = new Integer[7], linhas = new Integer[7];
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("src/fundamentals/arquivo.csv"));

        List<String> metricas = new ArrayList<>();
        List<String> c = new ArrayList<>();
        List<String> cPlus = new ArrayList<>();
        List<String> cSharp = new ArrayList<>();
        List<String> java = new ArrayList<>();
        List<String> python= new ArrayList<>();
        List<String> delphi = new ArrayList<>();
        List<String> php = new ArrayList<>();

        List<Double> desempenho = new ArrayList<>();

        while(input.hasNextLine()){
            String linha = input.nextLine();
            String[] colunas = linha.split(",");
            if (colunas[0].equals("linguagem")){
                for (int i = 0; i < colunas.length; i++) {
                    metricas.add(colunas[i]);

                }
            }
            if (colunas[0].equals("C")){
                for (int i = 0; i < colunas.length ; i++) {
                    c.add(colunas[i]);
                }
            }
            if (colunas[0].equals("C++")){
                for (int i = 0; i < colunas.length ; i++) {
                    cPlus.add(colunas[i]);
                }
            }
            if (colunas[0].equals("C#")){
                for (int i = 0; i < colunas.length ; i++) {
                    cSharp.add(colunas[i]);
                }
            }
            if (colunas[0].equals("Java")){
                for (int i = 0; i < colunas.length ; i++) {
                    java.add(colunas[i]);
                }
            }
            if (colunas[0].equals("Python")){
                for (int i = 0; i < colunas.length ; i++) {
                    python.add(colunas[i]);
                }
            }
            if (colunas[0].equals("Delphi")){
                for (int i = 0; i < colunas.length ; i++) {
                    delphi.add(colunas[i]);
                }
            }
            if (colunas[0].equals("PHP")){
                for (int i = 0; i < colunas.length ; i++) {
                    php.add(colunas[i]);
                }
            }
        }

        //C
        linguagem[0] = c.get(0);
        cpu[0] = Integer.valueOf(c.get(1));
        memoria[0] = Double.valueOf(c.get(2));
        tempo[0] = Integer.valueOf(c.get(3));
        linhas[0] = Integer.valueOf(c.get(4));

        //CPlus
        linguagem[1] = cPlus.get(0);
        cpu[1] = Integer.valueOf(cPlus.get(1));
        memoria[1] = Double.valueOf(cPlus.get(2));
        tempo[1] = Integer.valueOf(cPlus.get(3));
        linhas[1] = Integer.valueOf(cPlus.get(4));

        //CSharp
        linguagem[2] = cSharp.get(0);
        cpu[2] = Integer.valueOf(cSharp.get(1));
        memoria[2] = Double.valueOf(cSharp.get(2));
        tempo[2] = Integer.valueOf(cSharp.get(3));
        linhas[2] = Integer.valueOf(cSharp.get(4));

        //Java
        linguagem[3] = java.get(0);
        cpu[3] = Integer.valueOf(java.get(1));
        memoria[3] = Double.valueOf(java.get(2));
        tempo[3] = Integer.valueOf(java.get(3));
        linhas[3] = Integer.valueOf(java.get(4));

        //Python
        linguagem[4] = python.get(0);
        cpu[4] = Integer.valueOf(python.get(1));
        memoria[4] = Double.valueOf(python.get(2));
        tempo[4] = Integer.valueOf(python.get(3));
        linhas[4] = Integer.valueOf(python.get(4));

        //Delphi
        linguagem[5] = delphi.get(0);
        cpu[5] = Integer.valueOf(delphi.get(1));
        memoria[5] = Double.valueOf(delphi.get(2));
        tempo[5] = Integer.valueOf(delphi.get(3));
        linhas[5] = Integer.valueOf(delphi.get(4));

        //PHP
        linguagem[6] = php.get(0);
        cpu[6] = Integer.valueOf(php.get(1));
        memoria[6] = Double.valueOf(php.get(2));
        tempo[6] = Integer.valueOf(php.get(3));
        linhas[6] = Integer.valueOf(php.get(4));


        System.out.println("\nA) Listagem apresentando os nomes das linguagens e seus respectivos desempenhos, com duas\n" +
                "casas decimais--------------------------------\n");
        double desempenhoC = getDesempenho(cpu[0],memoria[0],tempo[0],linhas[0]);
        desempenho.add(desempenhoC);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[0], desempenhoC);

        double desempenhoCPlus = getDesempenho(cpu[1],memoria[1],tempo[1],linhas[1]);
        desempenho.add(desempenhoCPlus);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[1], desempenhoCPlus);

        double desempenhoCSharp = getDesempenho(cpu[2],memoria[2],tempo[2],linhas[2]);
        desempenho.add(desempenhoCSharp);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[2], desempenhoCSharp);

        double desempenhoJava = getDesempenho(cpu[3],memoria[3],tempo[3],linhas[3]);
        desempenho.add(desempenhoJava);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[3], desempenhoJava);

        double desempenhoPython = getDesempenho(cpu[4],memoria[4],tempo[4],linhas[4]);
        desempenho.add(desempenhoPython);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[4], desempenhoPython);

        double desempenhoDelphi = getDesempenho(cpu[5],memoria[5],tempo[5],linhas[5]);
        desempenho.add(desempenhoDelphi);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[5], desempenhoDelphi);

        double desempenhoPhp = getDesempenho(cpu[6],memoria[6],tempo[6],linhas[6]);
        desempenho.add(desempenhoPhp);
        System.out.printf("%s --> com o desempenho de: %.2f%n",linguagem[6], desempenhoPhp);

        int mediaCpu =0;
        for (int i = 0; i < cpu.length; i++) {
            int totalDeCpu = 0;
            totalDeCpu += cpu[i];
            mediaCpu = totalDeCpu / cpu.length;
        }

        int mediaMemoria =0;
        for (int i = 0; i < memoria.length; i++) {
            int aux = 0;
            aux += memoria[i];
            mediaMemoria = (int) (aux / memoria.length);
        }

        int mediaTempo =0;
        for (int i = 0; i < tempo.length; i++) {
            int aux = 0;
            aux += tempo[i];
            mediaTempo = (aux / tempo.length);
        }

        int mediaLinhas =0;
        for (int i = 0; i < linhas.length; i++) {
            int aux = 0;
            aux += linhas[i];
            mediaLinhas = (aux / linhas.length);
        }

        double mediaDesempenho =0;
        double somaDosDesempenhos = 0;
        for (int i = 0; i < desempenho.size() ; i++) {
            somaDosDesempenhos += desempenho.get(i);
            if(i == 6){
                mediaDesempenho = somaDosDesempenhos/desempenho.size();
            }
        }

        System.out.println("\nB) Nome das métricas e valor médio de cada métrica entre todas as linguagens, inclusive\n" +
                "desempenho, com três casas decimais--------------------------------\n");
        System.out.printf("O valor medio da metrica %s é de: %d%n", metricas.get(1),mediaCpu);
        System.out.printf("O valor medio da metrica %s é de: %d%n", metricas.get(2),mediaMemoria);
        System.out.printf("O valor medio da metrica %s é de: %d%n", metricas.get(3),mediaTempo);
        System.out.printf("O valor medio da metrica %s é de: %d%n", metricas.get(4),mediaLinhas);
        System.out.printf("O valor medio da metrica desempenho é de: %.3f%n", mediaDesempenho);


        System.out.println("\nC) Nome da linguagem com o maior desempenho---------------------");
        double maiorDesempenho = 0.0;
        int numeroDaLinguagemComMaisDesempenho =-1;
        for (int i = 0; i < desempenho.size(); i++) {
            if (desempenho.get(i) > maiorDesempenho){
                numeroDaLinguagemComMaisDesempenho = i;
                maiorDesempenho = desempenho.get(i);
            }
        }
        System.out.printf("A linguagem com maior desempenho é %s com a pontução %.3f%n",linguagem[numeroDaLinguagemComMaisDesempenho] , maiorDesempenho);

        System.out.println("\nD) Nome da linguagem com o menor número de linhas---------------------");
        int menorNumeroDeLinhas= 1000;
        int numeroDaLinguagemComMenosLinhas = -1;
        for (int i = 0; i < linhas.length; i++) {
            if (linhas[i] < menorNumeroDeLinhas){
                menorNumeroDeLinhas = linhas[i];
                numeroDaLinguagemComMenosLinhas = i;
            }
        }
        System.out.printf("A linguagem com menor numero de linhas é %s com %d linhas%n",linguagem[numeroDaLinguagemComMenosLinhas] , menorNumeroDeLinhas);



    }

    public static double getDesempenho(int cpu, double memoria, int tempo, int linhas){
        return  Math.pow(10,6) / (cpu*100 + memoria + tempo + linhas);
    }
}
