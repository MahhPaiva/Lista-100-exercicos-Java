package listadeexercicios100;
import java.util.Scanner;
import java.util.Random;

public class ExCondComposta {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    //Exercício 26
    public void exercicio26(){
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Não existe valor maior, os dois são iguais");
        } else if (num1 > num2){
            System.out.println("O primeiro valor é o maior");
        } else {
            System.out.println("O segundo valor é o maior");
        }
    }
    
    //Exercício 27
    public void exercicio27(){
        System.out.print("Informe a 1ª nota: ");
        Double nota1 = sc.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        Double nota2 = sc.nextDouble();
        Double media = (nota1 + nota2) / 2;
        if (media < 5){
            System.out.println("Média: "+media+" - REPROVADO!");
        } else if (media >= 5 && media < 7){
            System.out.println("Média: "+media+" - RECUPERAÇÃO!");
        } else if (media >= 7){
            System.out.println("Média: "+media+" - APROVADO!");
        }
    }
    
    //Exercício 28
    public void exercicio28(){
        System.out.print("Informe a largura do terreno: ");
        Double largura = sc.nextDouble();
        System.out.print("Informe o comprimento do terreno: ");
        Double comprimento = sc.nextDouble();
        Double area = largura * comprimento;
        if (area < 100){
            System.out.println("Área: "+area+" - TERRENO POPULAR");
        } else if (area >= 100 && area <= 500){
            System.out.println("Área: "+area+" - TERRENO MASTER");
        } else {
            System.out.println("Área: "+area+" - TERRENO VIP");
        }
    }
    
    //Exercício 29
    public void exercicio29(){
        System.out.print("Informe o nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Informe o salário: ");
        Double salario = sc.nextDouble();
        System.out.print("Trabalha a quantos anos na empresa? ");
        int anos = sc.nextInt();
        if (anos < 3){
            salario = salario * 1.03;
        } else if (anos >= 3 && anos < 10){
            salario = salario * 1.125;
        } else {
            salario = salario * 1.20;
        }
        System.out.println("Funcionário: "+nome);
        System.out.println("Novo salário: "+salario);
    }
    
    //Exercício 30
    public void exercicio30(){
        System.out.print("Digite o tamanho do 1° segmento: ");
        Double n1 = sc.nextDouble();
        System.out.print("Digite o tamanho do 2° segmento: ");
        Double n2 = sc.nextDouble();
        System.out.print("Digite o tamanho do 3° segmento: ");
        Double n3 = sc.nextDouble();
        if (n1 < (n2+n3)){
            if (n2 < (n1+n3)){
                if (n3 < (n1+n2)){
                    System.out.println("É possível formar um triângulo!");
                    if (n1.equals(n2) && n1.equals(n3)){
                        System.out.println("triângulo EQUILÁTERO");
                    } else if (n1.equals(n2) || n1.equals(n3) || n2.equals(n3)){
                        System.out.println("triângulo ISÓSCELES");
                    } else {
                        System.out.println("triângulo ESCALENO");
                    }
                } else {
                    System.out.println("NÃO é possível formar um triângulo!");
                }
            } else {
                System.out.println("NÃO é possível formar um triângulo!");
            }
        } else {
            System.out.println("NÃO é possível formar um triângulo!");
        }
    }
    
    //Exercício 31
    public void exercicio31(){
        //Pedra = 0
        //Papel = 1
        //Tesoura = 2
        int jComputador = random.nextInt(3);
        System.out.println("Pedra - 0 \nPapel - 1 \nTesoura - 2");
        System.out.println("\nJoKenPo! Faça uma jogada!! ");
        int jPlayer = sc.nextInt();
        if (jPlayer == 1 || jPlayer == 2 || jPlayer == 0){
            //COMPUTADOR = PEDRA
            if (jComputador == 0 && jPlayer == 1){
                System.out.println("Pedra x Papel \nVocê GANHOU!");
            } else if (jComputador == 0 && jPlayer == 2){
                System.out.println("Pedra x Tesoura \nVocê PERDEU!");
            } else if (jComputador == 0 && jPlayer == 0){
                System.out.println("Pedra x Pedra \nDeu EMPATE!");
            //COMPUTADOR = PAPEL
            } else if (jComputador == 1 && jPlayer == 1){
                System.out.println("Papel x Papel \nDeu EMPATE!");
            } else if (jComputador == 1 && jPlayer == 2){
                System.out.println("Papel x Tesoura \nVocê GANHOU!");
            } else if (jComputador == 1 && jPlayer == 0){
                System.out.println("Papel x Pedra \nVocê PERDEU!");
            //COMPUTADOR = TESOURA
            } else if (jComputador == 2 && jPlayer == 1){
                System.out.println("Tesoura x Papel \nVocê PERDEU!");
            } else if (jComputador == 2 && jPlayer == 2){
                System.out.println("Tesoura x Tesoura \nDeu EMPATE!");
            } else if (jComputador == 2 && jPlayer == 0){
                System.out.println("Tesoura x Pedra \nVocê GANHOU!");
            } 
        } else {
            System.out.println("Jogada inválida! Forneça outro valor!");
        }
    }
    
    //Exercício 32
    public void exercicio32(){
        int numSorteado = random.nextInt(1,6);
        System.out.println("Tente adivinhar qual o NÚMERO SORTEADO entre 1 e 5!! \nVocê tem 3 TENTATIVAS");
        int num = sc.nextInt();
        if (num == numSorteado){
            System.out.println("UAUU!! Acertou de primeira! \nNúmero sorteado: "+numSorteado);
        } else {
            System.out.println("ERROU! Tentativas Restantes: 2 \nTente outro número: ");
            num = sc.nextInt();
            if (num == numSorteado){
            System.out.println("MUITO BEM! Acertou de segunda! \nNúmero sorteado: "+numSorteado);
            } else {
                System.out.println("ERROU! Tentativas Restantes: 1 \nTente outro número: ");
                num = sc.nextInt();
                if (num == numSorteado){
                System.out.println("UFA! Acertou na última! \nNúmero sorteado: "+numSorteado);
                } else {
                    System.out.println("ERROU! Tentativas Restantes: 0 \nInfelizmente não foi dessa vez! \nNúmero sorteado: "+numSorteado);
                }
            }
        }
    }
    
    //Exercício 33
    public void exercicio33(){
        System.out.println("Informe o valor da casa: ");
        Double valorCasa = sc.nextDouble();
        System.out.println("Informe seu salário: ");
        Double salario = sc.nextDouble();
        System.out.println("Em quantos anos vai pagar a casa? ");
        Double anos = sc.nextDouble();
        Double prestacaoMensal = valorCasa / (anos*12);
        Double salario30 = salario * 0.3;
        System.out.println("\nPrestação Mensal: "+prestacaoMensal);
        System.out.println("30% do Salário: "+salario30);
        if (prestacaoMensal > salario30){
            System.out.println("Empréstimo NEGADO!");
        } else {
            System.out.println("Empréstimo APROVADO!");
        }
    }
    
    //Exercício 34
    public void exercicio34(){
        System.out.print("Informe a sua altura: ");
        Double altura = sc.nextDouble();
        System.out.print("Informe seu peso: ");
        Double peso = sc.nextDouble();
        Double imc = peso / Math.pow(altura,2);
        System.out.println("IMC: "+imc);
        if (imc < 18.5){
            System.out.println("Você está na faixa ABAIXO DO PESO");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Você está na faixa do PESO IDEAL");
        } else if (imc >= 25 && imc < 30){
            System.out.println("Você está na faixa do SOBREPESO");
        } else if (imc >= 30 && imc < 40){
            System.out.println("Você está na faixa da OBESIDADE");
        } else {
            System.out.println("Você está na faixa da OBESIDADE MÓRBIDA");
        }
    }
    
    //Exercício 35
    public void exercicio35(){
        System.out.print("Informe o tipo de carro alugado (p - Popular ; l - Luxo): ");
        String tipoCarro = sc.nextLine();
        System.out.print("Alugou por quantos dias? ");
        int dias = sc.nextInt();
        System.out.print("Quantos Km foram percorridos? ");
        Double km = sc.nextDouble();
        Double valorTotal;
        if (tipoCarro.equalsIgnoreCase("p")){
            if (km <= 100){
                valorTotal = (dias * 90) + (km * 0.2);
            } else {
                valorTotal = (dias * 90) + (km * 0.1);
            }
            System.out.println("\nValor total a ser pago: "+valorTotal);
        } else if (tipoCarro.equalsIgnoreCase("l")){
            if (km <= 200){
                valorTotal = (dias * 150) + (km * 0.3);
            } else {
                valorTotal = (dias * 90) + (km * 0.25);
            }
            System.out.println("\nValor total a ser pago: "+valorTotal);
        } else {
            System.out.println("\nTipo de carro inválido! Forneça as informações novamente!");
        }
    }
    
    //Exercício 36
    public void exercicio36(){
        System.out.print("Você fez quantas horas de exercício físico no mês? ");
        int horas = sc.nextInt();
        int pontos;
        if (horas < 10){
            pontos = horas * 2;
        } else if (horas >= 10 && horas <= 20){
            pontos = horas * 5;
        } else {
            pontos = horas * 10;
        }
        Double valorTotal = pontos * 0.05;
        System.out.println("\nPontos totais: "+pontos);
        System.out.println("Valor total ganho: R$"+valorTotal);
    }
    
    //Exercício 37
    public void exercicio37(){
        Double novoSalario;
        System.out.println("Informe o seu salário atual: ");
        Double salario = sc.nextDouble();
        System.out.println("Informe o seu gênero (f - feminino ; m - masculino): ");
        String genero = sc.nextLine();
        System.out.println("Informe a quantos anos trabalha na empresa: ");
        int anos = sc.nextInt();
        if (genero.equalsIgnoreCase("f")){
            if (anos < 15){
                novoSalario = salario * 1.05;
            } else if (anos >= 15 && anos <= 20){
                novoSalario = salario * 1.12;
            } else {
                novoSalario = salario * 1.23;
            }
            System.out.println("\nNovo salário: "+novoSalario);
        } else if (genero.equalsIgnoreCase("m")){
            if (anos < 20){
                novoSalario = salario * 1.03;
            } else if (anos >= 20 && anos <= 30){
                novoSalario = salario * 1.13;
            } else {
                novoSalario = salario * 1.25;
            }
            System.out.println("\nNovo salário: "+novoSalario);
        } else {
            System.out.println("Valor inválido, insira as informações novamente!");
        }
    }
    
}
