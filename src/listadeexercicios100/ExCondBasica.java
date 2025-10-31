package listadeexercicios100;
import java.util.Scanner;

public class ExCondBasica {
    Scanner sc = new Scanner(System.in);
    
    //Exercício 17
    public void exercicio17(){
        System.out.print("Informe a velocidade do carro em Km/h: ");
        Double velocidade = sc.nextDouble();
        if(velocidade > 80){
            Double velocidadeAcima = velocidade - 80;
            Double multa = velocidadeAcima * 5;
            System.out.println("Você foi multado! Estava "+velocidadeAcima+" Km/h acima do permitido.");
            System.out.println("Valor da multa: R$"+multa);
        } else {
            System.out.println("Tudo certo!");
        }
    }
    
    //Exercício 18
    public void exercicio18(){
        System.out.print("Informe o ano que você nasceu: ");
        int anoNasc = sc.nextInt();
        int idade = 2025 - anoNasc;
        if (idade >= 18){
            System.out.println("Você já pode votar!");
        } else {
            System.out.println("Você ainda não pode votar!");
        }
    }
    
    //Exercício 19
    public void exercicio19(){
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe a 1ª nota: ");
        Double nota1 = sc.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        Double nota2 = sc.nextDouble();
        Double media = (nota1 + nota2)/2;
        System.out.println("Nome do(a) Aluno(a): "+nome);
        System.out.println("Média: "+media);
        if(media >= 7){
            System.out.println("Você ficou acima da média! :)");
        } else {
            System.out.println("Você ficou abaixo da média! :(");
        }
    }
    
    //Exercício 20
    public void exercicio20(){
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("O número é PAR!");
        } else {
            System.out.println("O número é ÍMPAR!");
        }
    }
    
    //Exercício 21
    public void exercicio21(){
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();
        if (ano % 4 == 0){
            System.out.println("É um ano BISSEXTO!");
        } else {
            System.out.println("NÃO é um ano BISSEXTO!");
        }
    }
    
    //Exercício 22
    public void exercicio22(){
        System.out.print("Informe o seu ano de nascimento: ");
        int anoNasc = sc.nextInt();
        int idade = 2025 - anoNasc;
        if (idade >= 18){
            int anosAlistamento = idade - 18;
            System.out.println("Já se passaram "+anosAlistamento+" anos do alistamento.");
        } else {
            int anosAlistamento = 18 - idade;
            System.out.println("Ainda faltam "+anosAlistamento+" anos para o alistamento.");
        }
    }
    
    //Exercício 23
    public void exercicio23(){
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe o seu gênero (f - feminino ; m - masculino): ");
        String genero = sc.nextLine();
        System.out.print("Informe o valor da sua compra: ");
        Double compra = sc.nextDouble();
        if (genero.equalsIgnoreCase("f")){
            System.out.println("Cliente: "+nome+"\nValor com desconto: "+(compra*0.87));
        }
        if (genero.equalsIgnoreCase("m")){
            System.out.println("Cliente: "+nome+"\nValor com desconto: "+(compra*0.95));
        }
    }
    
    //Exercício 24
    public void exercicio24(){
        System.out.print("Informe a distância que deseja percorrer em Km: ");
        Double distancia = sc.nextDouble();
        if (distancia < 200){
            System.out.println("Preço da passagem: R$"+ (distancia*0.5));
        } else {
            System.out.println("Preço da passagem: R$"+ (distancia*0.45));
        }
    }
    
    //Exercício 25
    public void exercicio25(){
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
    
}
