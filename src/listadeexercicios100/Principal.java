package listadeexercicios100;
/**
 * @author Maria Clara
 */

import java.util.Scanner;

public class Principal {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ExSeqBasica executor1 = new ExSeqBasica();
        ExCondBasica executor2 = new ExCondBasica();
        ExCondComposta executor3 = new ExCondComposta();
        ExRepEnquanto executor4 = new ExRepEnquanto();
        ExRepEnquantoFlag executor5 = new ExRepEnquantoFlag();
        ExFacaEnquanto executor6 = new ExFacaEnquanto();
        ExRepPara executor7 = new ExRepPara();
        ExVetores executor8 = new ExVetores();
        
        //O executor para os exercicios que precisam de objetos
        //executor8.exercicio85();
        
        //O executor para os exercícios do "Gerador"
        //ExProcedimentos.Gerador("Testando Java",4,1);
        
        //Declaração de valores e executor do "Somador1"
        /*
        System.out.print("Informe o 1° valor: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o 2° valor: ");
        int num2 = sc.nextInt();
        ExProcedimentos.Somador(num1, num2);
        */
        
        //Declaração de valores e executor do "Maior1"
        /*
        System.out.print("Informe o 1° valor: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o 2° valor: ");
        int num2 = sc.nextInt();
        ExProcedimentos.Maior(num1, num2);
        */
        
        //Declaração de valores e executor do "ParOuImpar"
        /*
        System.out.print("Informe um número: ");
        int num = sc.nextInt();
        ExProcedimentos.ParOuImpar(num);
        */
        
        //Declaração de valores e executor do "Contador"
        /*
        System.out.print("Informe o valor de início: ");
        int inicio = sc.nextInt();
        System.out.print("Informe o valor para fim: ");
        int fim = sc.nextInt();
        System.out.print("Informe o valor de incremento: ");
        int cont = sc.nextInt();
        ExProcedimentos.Gerador(inicio,fim,cont);
        */
        
        //O executor para os exercícios do "Fibonacci"
        //ExProcedimentos.Fibonacci(9);
        
        //Execução do "Somador2"
        //System.out.println("O resultado do Somador2 é: "+ExFuncoes.Somador2(2, 3));
        
        //Execução do "Media"
        //System.out.println("O resultado da Media  é: "+ExFuncoes.Media(5, 8));
        
        //Execução do "Maior2"
        /*
        System.out.print("Informe o 1° valor: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o 2° valor: ");
        int num2 = sc.nextInt();
        System.out.print("Informe o 3° valor: ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num1 == num3){
            System.out.println("Os números são iguais");    
        } else {
            System.out.println("O maior número é: "+ExFuncoes.Maior(num1, num2, num3));
        }
        */
    }
}
