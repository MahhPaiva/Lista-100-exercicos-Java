package listadeexercicios100;
import java.util.Scanner;

public class ExSeqBasica{
    Scanner sc = new Scanner(System.in);
    
    //Exercício 1
    public void exercicio1(){
        System.out.println("Olá Mundo!");
    }
    
    //Exercício 2
    public void exercicio2(){
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo(a) "+nome);
    }
    
    //Exercício 3
    public void exercicio3(){
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe o seu salário: ");
        Double salario = sc.nextDouble();
        System.out.println("Nome do(a) Funcionário(a): "+nome+"\nSalário: R$"+salario);
    }
    
    //Exercício 4
    public void exercicio4(){
        System.out.print("Informe um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int num2 = sc.nextInt();
        System.out.println("A soma entre " +num1+ " e " +num2+ " é igual a "+ (num1+num2));
    }
    
    //Exercício 5
    public void exercicio5(){
        System.out.print("Informe a 1ª nota: ");
        Double n1 = sc.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        Double n2 = sc.nextDouble();
        Double media = (n1 + n2)/2;
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
        System.out.println("Média: " + media);
    }
    
    //Exercício 6
    public void exercicio6(){
        System.out.print("Informe um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("O antecessor é: "+(num-1));
        System.out.println("O sucessor é: "+(num+1));
    }
    
    //Exercício 7
    public void exercicio7(){
        System.out.print("Informe um número real: ");
        Float num = sc.nextFloat();
        System.out.println("O dobro de "+num+" é: "+(num*2));
        System.out.println("A terça parte de "+num+" é: "+(num/3));
    }
    
    //Exercício 8
    public void exercicio8(){
        System.out.print("Digite uma distância em metros: ");
        Double distancia = sc.nextDouble();
        System.out.println("A distância de "+distancia+"m corresponde a:");
        System.out.println((distancia/1000)+"km");
        System.out.println((distancia/100)+"hm");
        System.out.println((distancia/10)+"dam");
        System.out.println((distancia*10)+"dm");
        System.out.println((distancia*100)+"cm");
        System.out.println((distancia*1000)+"mm");
    }
    
    //Exercício 9
    public void exercicio9(){
        System.out.print("Quantos reais você tem? ");
        Double reais = sc.nextDouble();
        Double dolar = reais/5.75;
        String dolarFormatado = String.format("%.2f",dolar);
        System.out.println("Com isso você pode comprar "+dolarFormatado+" dólares");
    }
    
    //Exercício 10
    public void exercicio10(){
        System.out.print("Informe a largura da parede: ");
        Float largura = sc.nextFloat();
        System.out.print("Informe a altura da parede: ");
        Float altura = sc.nextFloat();
        Float area = largura * altura;
        System.out.println("Área a ser pintada: "+area+"m²");
        System.out.println("Tinta necessária: "+area/2+"L");
    }
    
    //Exercício 11
    public void exercicio11(){
        System.out.print("Informe o valor de A: ");
        Float a = sc.nextFloat();
        System.out.print("Informe o valor de B: ");
        Float b = sc.nextFloat();
        System.out.print("Informe o valor de C: ");
        Float c = sc.nextFloat();
        Double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("O valor de Delta é: "+delta);
    }
    
    //Exercício 12
    public void exercicio12(){
        System.out.print("Informe o preço do produto: ");
        Double preco = sc.nextDouble();
        System.out.println("O preço promocional é: "+(preco*0.95));
    }
    
    //Exercício 13
    public void exercicio13(){
        System.out.println("Informe o seu salário: ");
        Double salario = sc.nextDouble();
        Double novoSalario = salario * 1.15;
        System.out.println("O seu novo salário com 15% de aumento é: "+novoSalario);
    }
    
    //Exercício 14
    public void exercicio14(){
        System.out.print("Qual a quantidade de Km percorridos? ");
        Double km = sc.nextDouble();
        System.out.print("O carro foi alugado para quantos dias? ");
        int dias = sc.nextInt();
        Double preco = (dias * 90) + (km * 0.20);
        System.out.println("Preço total a pagar: "+preco);
    }
    
    //Exercício 15
    public void exercicio15(){
        System.out.print("Informe o número de dias trabalhados no mês: ");
        int dias = sc.nextInt();
        Double salario = (dias * 8.0 * 25.0);
        System.out.println("O seu salário é de: "+salario);
    }
    
    //Exercício 16
    public void exercicio16(){
        System.out.print("Quantos cigarros você fuma por dia? ");
        int quantCigarrosPorDia = sc.nextInt();
        System.out.print("Você fumou por quantos anos? ");
        int anos = sc.nextInt();
        int totalCigarros = quantCigarrosPorDia * 365 * anos;
        int minTotais = (totalCigarros * 10);
        int dias = minTotais/1440;
        System.out.println("Você vai perder aproximadamente "+dias+" dias de vida!");
    }
    
}
