package listadeexercicios100;
import java.util.Scanner;
//import java.util.Random;

public class ExRepPara {
    Scanner sc = new Scanner(System.in);
    
    //Exercício 64
    public void exercicio64(){
        for (int i = 0; i <= 40; i += 5){
            System.out.print(i+" ");
        }
        System.out.println("Acabou!");
    }
    
    //Exercício 65
    public void exercicio65(){
        for (int i = 100; i >= 0; i -= 10){
            System.out.print(i+" ");
        }
        System.out.println("Acabou!");
    }
    
    //Exercício 66
    public void exercicio66(){
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
    
    //Exercício 67
    public void exercicio67(){
        System.out.print("Informe um número inteiro positivo: ");
        int num = sc.nextInt();
        System.out.print("Contagem: ");
        for (int i = 0; i <= num; i++){
            System.out.print(i+", ");
        }
        System.out.println("FIM!");
    }
    
    //Exercício 68
    public void exercicio68(){
        int contMulher = 0, contHomem100 = 0;
        double somaPesoMulher = 0, maiorPesoHomem = 0;
        for (int i = 0; i <= 3; i++){
            System.out.print("Informe seu sexo (f - feminino ; m - masculino): ");
            String sexo = sc.nextLine();
            System.out.print("Informe seu peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();
            if(sexo.equalsIgnoreCase("f")){
                somaPesoMulher += peso;
                contMulher++;
            } else if(sexo.equalsIgnoreCase("m")){
                if(peso > 100){
                    contHomem100++;
                }
                if(peso > maiorPesoHomem){
                    maiorPesoHomem = peso;
                }
            }
        }
        Double mediaPesoMulher = somaPesoMulher / contMulher;
        System.out.println("Quantidade mulheres cadastradas: "+contMulher);
        System.out.println("Quantidade homens mais de 100Kg: "+contHomem100);
        System.out.println("Média de peso entre mulheres: "+mediaPesoMulher);
        System.out.println("Maior peso entre os homens: "+maiorPesoHomem);
    }
    
    //Exercício 69
    public void exercicio69(){
        int soma = 0;
        System.out.print("Informe o primeiro termo da PA: ");
        int n = sc.nextInt();
        System.out.print("Informe a razão da PA: ");
        int razao = sc.nextInt();
        System.out.print("\nPA: ");
        for(int i = 0; i < 10; i++){
            System.out.print(n+"  ");
            soma += n;
            n += razao;
            //for(int n = nInicial; i ; n += razao){
            //    System.out.print(n+" ");
            //    soma += n;
            //}
        }
        System.out.println("\nSoma entre todos os valores: "+soma);
    }
    
    //Exercício 70
    public void exercicio70(){
        int n1 = 0, n2 = 1, proxNum = 0;
        for (int i = 0; i < 10; i++){
            proxNum = n1+n2;
            n1 = n2;
            n2 = proxNum;
            System.out.println(n1+" ");
        }
    }
}
