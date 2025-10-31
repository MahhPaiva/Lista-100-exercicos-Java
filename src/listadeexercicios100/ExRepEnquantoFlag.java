package listadeexercicios100;
import java.util.Scanner;
//import java.util.Random;

public class ExRepEnquantoFlag {
    Scanner sc = new Scanner(System.in);
    
    //Exercício 56
    public void exercicio56(){
        int soma = 0;
        while(true){
            System.out.print("Digite um número inteiro (Digite 1111 para encerrar o programa): ");
            int num = sc.nextInt();
            if (num == 1111){
                break;
            } else {
                soma += num;
            }
        }
        System.out.println("\nSomatório: "+soma);
    }
    
    //Exercício 57
    public void exercicio57(){
        Double salHomem = 0.0, salMulher = 0.0;
        while(true){
            System.out.print("Informe o sexo do funcionário (f - feminino ; m - masculino): ");
            String sexo = sc.nextLine();
            System.out.print("Informe o salário do funcionário: ");
            Double salario = sc.nextDouble();
            sc.nextLine();
            if (sexo.equalsIgnoreCase("f")){
                salMulher += salario;
            } else if (sexo.equalsIgnoreCase("m")){
                salHomem += salario;
            } else {
                System.out.println("Valor inválido! Informe novamente");
            }
            System.out.println("=====================================");
            System.out.println("Quer continuar? (s - sim ; n - não): ");
            String resposta = sc.nextLine();
            System.out.println("=====================================");
            if (resposta.equals("n")){
                break;
            }
        }
        System.out.println("Total de salário aos homens: "+salHomem);
        System.out.println("Total de salário às mulheres: "+salMulher);
    }
    
    //Exercício 58
    public void exercicio58(){
        int quantAlunos = 0;
        Double somaIdade = 0.0;
        while(true){
            System.out.print("Informe a idade do aluno (Digite 999 para parar): ");
            int idade = sc.nextInt();
            if (idade == 999){
                break;
            } else {
                somaIdade += idade;
                quantAlunos++;
            }
        }
        Double media = somaIdade / quantAlunos;
        System.out.println("\nQuantidade de alunos: "+quantAlunos);
        System.out.println("Média de idade: "+media);
    }
    
    //Exercício 59
    public void exercicio59(){
        int maiorIdade = 0, quantHomem = 0;
        int mulherMaisJovem = Integer.MAX_VALUE;
        Double somaIdadeHomem = 0.0;
        while(true){
            System.out.print("Informe o sexo do funcionário (f - feminino ; m - masculino): ");
            String sexo = sc.nextLine();
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            if (sexo.equalsIgnoreCase("f") && idade < mulherMaisJovem){
                mulherMaisJovem = idade;
            }
            if (sexo.equalsIgnoreCase("m")){
                quantHomem++;
                somaIdadeHomem += idade;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            System.out.println("=====================================");
            System.out.println("Quer continuar? (s - sim ; n - não): ");
            String resposta = sc.nextLine();
            System.out.println("=====================================");
            if (resposta.equalsIgnoreCase("n")){
                break;
            }
        }
        Double mediaHomem = somaIdadeHomem / quantHomem;
        System.out.println("Maior idade lida: "+maiorIdade);
        System.out.println("Quantidade de homens cadastrados: "+quantHomem);
        System.out.println("Idade da mulher mais jovem: "+mulherMaisJovem);
        System.out.println("Média de idade dos homens: "+mediaHomem);
    }
    
    //Exercício 60
    public void exercicio60(){
        int mulherMaisJovem = Integer.MAX_VALUE;
        int maiorIdade = 0, homemMais30 = 0, mulherMenos18 = 0, quantPessoas = 0;
        Double somaIdade = 0.0;
        String nomeMaisVelha = "", nomeMulherMaisJovem = "";
        while(true){
            System.out.print("Informe seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Informe o seu sexo (f - feminino ; m - masculino): ");
            String sexo = sc.nextLine();
            System.out.print("Informe a sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            somaIdade += idade;
            quantPessoas++;
            if (sexo.equalsIgnoreCase("f")){
                if(idade < mulherMaisJovem){
                    mulherMaisJovem = idade;
                    nomeMulherMaisJovem = nome;
                }
                if(idade < 18){
                    mulherMenos18++;
                }
            }
            if (sexo.equalsIgnoreCase("m") && idade > 30){
                homemMais30++;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
                nomeMaisVelha = nome;
            }
            System.out.println("=====================================");
            System.out.println("Quer continuar? (s - sim ; n - não): ");
            String resposta = sc.nextLine();
            System.out.println("=====================================");
            if (resposta.equalsIgnoreCase("n")){
                break;
            }
        }
        Double media = somaIdade/ quantPessoas;
        System.out.println("Nome da pessoa mais velha: "+nomeMaisVelha);
        System.out.println("Nome da mulher mais jovem: "+nomeMulherMaisJovem);
        System.out.println("Média de idade do grupo: "+media);
        System.out.println("Quantidade de homens com + de 30: "+homemMais30);
        System.out.println("Quantidade de mulher com - de 18: "+mulherMenos18);
    }
}
