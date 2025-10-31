package listadeexercicios100;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ExVetores {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    
    //Exercício 71
    public void exercicio71(){
        int[] vetor = new int[8];
        for(int i = 0; i < 8; i++){
            vetor[i] = 999;
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 72
    public void exercicio72(){
        int[] vetor = new int[10];
        for(int i = 0; i < 10; i++){
            vetor[i] = (i+1)*5;
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 73
    public void exercicio73(){
        int[] vetor = new int[10];
        int numInverso = vetor.length;
        for(int i = 0; i < 10; i++){
            numInverso--;
            vetor[i] = numInverso;
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 74
    public void exercicio74(){
        int[] vetor = new int[10];
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                vetor[i] = 5;
            } else {
                vetor[i] = 3;
            }
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 75
    public void exercicio75(){
        int[] vetor = new int[15];
        int n1 = 0, n2 = 1, proxNum = 0;
        for (int i = 0; i < 15; i++){
            proxNum = n1+n2;
            n1 = n2;
            n2 = proxNum;
            vetor[i] = n1;
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 76
    public void exercicio76(){
        int[] vetor = new int[7];
        for (int i = 0; i < 7; i++){
            vetor[i] = random.nextInt();
            System.out.println("Posição "+i+": ["+vetor[i]+"]");
        }
    }
    
    //Exercício 77
    public void exercicio77(){
        String[] vetor = new String[7];
        for (int i = 0; i < 7; i++){
            System.out.print("Informe o seu nome: ");
            vetor[i] = sc.nextLine();
        }
        System.out.println("Nomes na ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }
    
    //Exercício 78
    public void exercicio78(){
        int[] vetor = new int[15];
        for (int i = 0; i < 15; i++){
            System.out.print("Digite um número para o vetor: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("\n\nVetor completo: ");
        for (int i = 0; i < 15; i++){
            System.out.print(vetor[i]+"  ");
        }
        System.out.println("\n\nPosições em que valores são múltiplos de 10:");
        for (int i = 0; i < 15; i++){
            if(vetor[i] % 10 == 0){
                System.out.print(i+"  ");
            }
        }
    }
    
    //Exercício 79
    public void exercicio79(){
        int[] vetor = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número inteiro: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("\nNúmeros pares digitados:");
        for(int i = 0; i < 10; i++){
            if(vetor[i] % 2 == 0){
                System.out.println(vetor[i]+" -> posição: "+i);
            }
        }
    }
    
    //Exercício 80
    public void exercicio80(){
        int[] vetor = new int[30];
        int cont = 0;
        for(int i=0;i<30;i++){
            vetor[i] = random.nextInt(1, 16);
        }
        System.out.print("DIgite um número: ");
        int num = sc.nextInt();
        System.out.println("\nPosições em que a chave foi encontrada: ");
        for(int i=0;i<30;i++){
            if (vetor[i]==num){
                System.out.print(i+"  ");
                cont++;
            }
        }
        System.out.println("\n\nA chave foi encontrada "+cont+" vezes!");
    }
    
    //Exercício 81
    public void exercicio81(){
        int[] idade = new int[8];
        int maiorIdade = 0;
        Double somaIdade = 0.0;
        String mais25 = "Posições em que a idade é maior que 25: ";
        String posicaoMaiorIdade = "Posições em que a maior idade foi digitada: ";
        for(int i = 0; i < 8; i++){
            System.out.print("Digite uma idade: ");
            idade[i] = sc.nextInt();
            somaIdade += idade[i];
            if(idade[i] > 25){
                mais25 += (i+"  ");
            } 
            if(idade[i] > maiorIdade){
                maiorIdade = idade[i];
            }
        }
        Double media = somaIdade / idade.length;
        for(int i = 0; i < 8; i++){
            if(idade[i] == maiorIdade){
                posicaoMaiorIdade += (i+"  ");
            }
        }
        System.out.println("\nMédia de idade cadastrada: "+media);
        System.out.println(mais25);
        System.out.println("Maior idade digitada: "+maiorIdade);
        System.out.println(posicaoMaiorIdade);
    }
    
    //Exercício 82
    public void exercicio82(){
        Double[] nota = new Double[10];
        Double somaNota = 0.0;
        Double maiorNota = 0.0;
        int alunosAcimaMedia = 0;
        String posicaoMaiorNota = "Posições em que a maior nota aparece: ";
        for (int i = 0; i < 10; i++){
            System.out.print("Informe a nota do aluno: ");
            nota[i] = sc.nextDouble();
            somaNota += nota[i];
            if (nota[i] > maiorNota){
                maiorNota = nota[i];
            }
        }
        Double media = somaNota / nota.length;
        for (int i = 0; i < 10; i++){
            if (nota[i] >= media){
                alunosAcimaMedia++;
            }
            if(nota[i].equals(maiorNota)){
                posicaoMaiorNota += (i+"  ");
            }
        }
        System.out.println("\nMédia de nota da turma: "+media);
        System.out.println("Quantidade de alunos acima da média: "+alunosAcimaMedia);
        System.out.println("Maior nota digitada: "+maiorNota);
        System.out.println(posicaoMaiorNota);
    }   
    
    //Exercício 83
    public void exercicio83(){
        int[] vetor = new int[20];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Gera número entre 0 e 99
        }
        System.out.println("Números gerados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        Arrays.sort(vetor);
        System.out.println("\n\nNúmeros ordenados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
    
    //Exercício 84
    public void exercicio84(){
        String[] nome = new String[9];
        int[] idade = new int[9];
        for(int i = 0; i < 9; i++){
            System.out.print("Digite um nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            idade[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\nListagem das pessoas menores de idade: \n");
        for(int i = 0; i < 9; i++){
            if(idade[i] < 18){
                System.out.println(nome[i]+": "+idade[i]+" ano(s)");
            }
        }
    }
    
    //Exercício 85
    public void exercicio85(){
        String[] nome = new String[5];
        String[] sexo = new String[5];
        Double[] salario = new Double[5];
        for (int i = 0; i < 5; i++){
            System.out.print("\nInforme o nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Informe o sexo (f - feminino ; m - masculino ; o - outro): ");
            sexo[i] = sc.nextLine();
            System.out.print("Informe o salário: ");
            salario[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("\nListagem de mulheres que recebem mais de 5 mil:");
        for (int i = 0; i < 5; i++){
            if(sexo[i].equalsIgnoreCase("f") && salario[i] >= 5000){
                System.out.println("\nNome: "+nome[i]+"\nSexo: Feminino \nSalário: "+salario[i]);
            }
        }
    }
}
