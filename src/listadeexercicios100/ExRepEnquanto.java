package listadeexercicios100;
import java.util.Scanner;
import java.util.Random;

public class ExRepEnquanto {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    //Exercício 38
    public void exercicio38(){
        int i = 6;
	while (i <= 11){
		System.out.print(i+"  ");
		i++;
	}
	System.out.println("Acabou!");
    }
    
    //Exercício 39
    public void exercicio39(){
        int i = 10;
            while (i >= 3){
      	    System.out.print(i+"  ");
	    i--;
	}
	System.out.println("Acabou!");
    }
    
    //Exercício 40
    public void exercicio40(){
        int i = 0;
            while (i <= 18){
                System.out.print(i+"  ");
                i += 3;
            }
            System.out.println("Acabou!");
    }
    
    //Exercício 41
    public void exercicio41(){
        int i = 100;
            while (i >= 0){
                System.out.print(i+"  ");
                i -= 5;
            }
            System.out.println("Acabou!");
    }
    
    //Exercício 42
    public void exercicio42(){
        int i = 0;
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
            while (i <= n){
                System.out.print(i+"  ");
                i++;
            }
            System.out.println("Acabou!");
    }
    
    //Exercício 43
    public void exercicio43(){
        int i = 30;
            while (i >= 1){
                if (i % 4 == 0){
                    System.out.print("["+i+"]  ");
                } else {
                    System.out.print(i+"  ");
                }
                i--;
            }
            System.out.println("Acabou!");
    }
    
    //Exercício 44
    public void exercicio44(){
        System.out.print("Digite o valor inicial: ");
        int nInicial = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int nFinal = sc.nextInt();
        System.out.print("Digite o valor de incremento: ");
        int incremento = sc.nextInt();
            while (nInicial <= nFinal){
                System.out.print(nInicial+"  ");
                nInicial += incremento;
            }
            System.out.println("Acabou!");
    }
    
    //Exercício 45
    public void exercicio45(){
        System.out.print("Digite o valor inicial: ");
        int nInicial = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int nFinal = sc.nextInt();
        if(nInicial < nFinal){
            System.out.print("Digite o valor de incremento: ");
            int incremento = sc.nextInt();
            while (nInicial <= nFinal){
                System.out.print(nInicial+"  ");
                nInicial += incremento;
            }
        } else if(nInicial > nFinal){
            System.out.print("Digite o valor de decremento: ");
            int decremento = sc.nextInt();
            while (nInicial >= nFinal){
                System.out.print(nInicial+"  ");
                nInicial -= decremento;
            }
        } else {
            System.out.println("Os valores são iguais!");
        }
        
        System.out.println("Acabou!");
    }
    
    //Exercício 46
    public void exercicio46(){
        int i = 6;
        int soma = 0;
        while(i <= 100){
            soma += i;
            i += 2;
        }
        System.out.println("Resultado da soma: "+soma);
    }
    
    //Exercício 47
    public void exercicio47(){
        int i = 500;
        int soma = 0;
        while(i >= 0){
            soma += i;
            i -= 50;
        }
        System.out.println("Resultado da expressão: "+soma);
    }
    
    //Exercício 48
    public void exercicio48(){
        int i = 0, soma = 0;
        System.out.println("Digite 7 números inteiros:");
        while(i < 7){
            int n = sc.nextInt();
            soma += n;
            i++;
        }
        System.out.println("O somatório entre eles é: "+soma);
    }
    
    //Exercício 49
    public void exercicio49(){
        int i = 0, nPar = 0, nImpar = 0;
        while (i < 6){
            System.out.print("Informe um número inteiro: ");
            int num = sc.nextInt();
            if (num % 2 == 0){
                nPar++;
            } else {
                nImpar++;
            }
            i++;
        }
        System.out.println("Quantidade de números pares: "+nPar);
        System.out.println("Quantidade de números ímpares: "+nImpar);
    }
    
    //Exercício 50
    public void exercicio50(){
        int i = 0, acimaDe5 = 0, divPor3 = 0;
        System.out.print("Números sorteados: ");
        while(i < 20){
            int num = random.nextInt(0, 10);
            System.out.print(num+"  ");
            if (num > 5){
                acimaDe5++;
            }
            if (num % 3 == 0){
                divPor3++;
            }
            i++;
        }
        System.out.println("\nQuantidade de números acima de 5: "+acimaDe5);
        System.out.println("Quantidade de números divisíveis por 3: "+divPor3);
    }
    
    //Exercício 51
    public void exercicio51(){
        int i = 0;
        Double maiorPreco = Double.MIN_VALUE;
        Double menorPreco = Double.MAX_VALUE;
        while (i < 8){
            System.out.print("Informe o preço do produto: ");
            Double num = sc.nextDouble();
            if (num > maiorPreco){
                maiorPreco = num;
            }
            if (num < menorPreco){
                menorPreco = num;
            }
            i++;
        }
        System.out.println("Maior preço digitado: "+maiorPreco);
        System.out.println("Menor preço digitado: "+menorPreco);
    }
    
    //Exercício 52
    public void exercicio52(){
        int i = 0, mais18 = 0, menos5 = 0, maiorIdade = 0, soma = 0;
        while (i < 10){
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            if (idade > 18){
                mais18++;
            }
            if (idade < 5){
                menos5++;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            soma += idade;
            i++;
        }
        Double media = soma/10.0;
        System.out.println("\nMédia de idade do grupo: "+media);
        System.out.println("Quantidade de pessoas com mais de 18: "+mais18);
        System.out.println("Quantidade de pessoas com menos de 5: "+menos5);
        System.out.println("Maior idade lida: "+maiorIdade);
    }
    
    //Exercício 53
    public void exercicio53(){
        int i = 0, quantHomem = 0, quantMulher = 0, mulherMais20 = 0;
        Double somaTotal = 0.0, somaHomem = 0.0;
        while (i < 5){
            System.out.print("Informe seu sexo (f - Feminino ; m - Masculino): ");
            String sexo = sc.nextLine();
            System.out.print("Informe sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            
            if (sexo.equalsIgnoreCase("m")){
                quantHomem++;
                somaHomem += idade;
            }
            if (sexo.equalsIgnoreCase("f")){
                quantMulher++;
                if (idade > 20){
                    mulherMais20++;
                }
            }
            somaTotal += idade;
            i++;
        }
        Double media = somaTotal / 5.0;
        Double mediaHomem = somaHomem / quantHomem;
        System.out.println("\nQuantidade de homens cadastrados: "+quantHomem);
        System.out.println("Quantidade de mulheres cadastradas: "+quantMulher);
        System.out.println("Quantidade de mulheres com mais de 20 anos: "+mulherMais20);
        System.out.println("Média de idade do grupo: "+media);
        System.out.println("Média de idade dos homens: "+mediaHomem);
    }
    
    //Exercício 54
    public void exercicio54(){
        int i = 0, mais90 = 0, menos50menos160 = 0, mais190mais100 = 0;
        Double somaAltura = 0.0;
        while (i < 7){
            System.out.print("Informe seu peso: ");
            Double peso = sc.nextDouble();
            System.out.print("Informe sua altura: ");
            Double altura = sc.nextDouble();
            if (peso > 90){
                mais90++;
            }
            if (peso < 50 && altura < 1.60){
                menos50menos160++;
            }
            if (altura > 1.90 && peso > 100){
                mais190mais100++;
            }
            somaAltura += altura;
            i++;
        }
        Double media = somaAltura/7;
        System.out.println("\nMédia de altura do grupo: "+media);
        System.out.println("Quantas pessoas que pesam mais de 90Kg: "+mais90);
        System.out.println("Quantas pessoas pesam menos de 50Kg e tem menos de 1.60m: "+menos50menos160);
        System.out.println("Quantas pessoas medem mais de 1.90m e pesam mais de 100Kg: "+mais190mais100);
    }
    
    //Exercício 55
    public void exercicio55(){
        int numSorteado = random.nextInt(1,11);
        int i = 4;
        System.out.println("Tente adivinhar qual o NÚMERO SORTEADO entre 1 e 10!! \nVocê tem 4 TENTATIVAS");
        while (i > 0){
            System.out.println("TENTATIVAS: "+i);
            System.out.print("Tente um número: ");
            int num = sc.nextInt();
            if (num == numSorteado){
                System.out.println("ACERTOUUU!!! \nNúmero sorteado: "+numSorteado);
                break;
            } else {
                System.out.println("ERROU!");
            }
            i--;
        }
        if (i == 0){
            System.out.println("VOCE PERDEU!!");
        }
    }
}
