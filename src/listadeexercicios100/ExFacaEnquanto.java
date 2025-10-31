package listadeexercicios100;
import java.util.Scanner;
//import java.util.Random;

public class ExFacaEnquanto {
    Scanner sc = new Scanner(System.in);
    
    //Exercício 61
    public void exercicio61(){
        int i = 0;
        do {
            System.out.print(i+"  ");
            i += 3;
        } while (i <= 30);
        System.out.println("Acabou!");
    }
    
    //Exercício 62
    public void exercicio62(){
        int quant = 0, pessoas21ouMais = 0;
        Double somaIdade = 0.0;
        do {
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            somaIdade += idade;
            if(idade >= 21){
                pessoas21ouMais++;
            }
            quant++;
            System.out.println("=====================================");
            System.out.println("Quer continuar? (s - sim ; n - não): ");
            String resposta = sc.nextLine();
            System.out.println("=====================================");
            if (resposta.equals("n")){
                break;
            }
        } while (true);
        Double media = somaIdade / quant;
        System.out.println("Quantidade de idades digitadas: "+quant);
        System.out.println("Média da idades: "+media);
        System.out.println("Quantidade de pessoas com 21 ou mais: "+pessoas21ouMais);
    }
    
    //Exercício 63
    public void exercicio63(){
        int menorValor = Integer.MAX_VALUE, valorPar = 0, quant = 0;
        Double soma = 0.0;
        do {
            System.out.print("Informe a idade: ");
            int num = sc.nextInt();
            sc.nextLine();
            soma += num;
            if(num < menorValor){
                menorValor = num;
            }
            if(num % 2 == 0){
                valorPar++;
            }
            quant++;
            System.out.println("=====================================");
            System.out.println("Quer continuar? (s - sim ; n - não): ");
            String resposta = sc.nextLine();
            System.out.println("=====================================");
            if (resposta.equals("n")){
                break;
            }
        } while (true);
        Double media = soma / quant;
        System.out.println("Somatório dos números: "+soma);
        System.out.println("Média: "+media);
        System.out.println("Menor valor: "+menorValor);
        System.out.println("Quantidade de valores PAR: "+valorPar);
    }
}
