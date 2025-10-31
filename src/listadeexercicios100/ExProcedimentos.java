package listadeexercicios100;

public class ExProcedimentos {
    
    //Exercício 86
    public static void Gerador() {
        System.out.println("+ ======= +");
        System.out.println("Olá, Mundo!");
        System.out.println("+ ======= +");
    }
    
    //Exercício 87
    public static void Gerador(String mensagem) {
        System.out.println("+  =======  +");
        System.out.println(mensagem);
        System.out.println("+  =======  +");
    }
    
    //Exercício 88
    public static void Gerador(String mensagem, int vezes) {
        System.out.println("+  =======  +");
        for(int i = 0; i < vezes; i++){
        System.out.println(mensagem);
        }
        System.out.println("+  =======  +");
    }
    
    //Exercício 89
    public static void Gerador(String mensagem, int vezes, int borda) {
        String estiloBorda = "";
        switch (borda) {
            case 1:
                estiloBorda = "+----======----+";
                break;
            case 2:
                estiloBorda = "~~~~~::::::~~~~~";
                break;
            case 3:
                estiloBorda = "<<<<<------>>>>>";
                break;
            default:
                System.out.println("Borda inválida!");
                break;
        }
        System.out.println(estiloBorda);
        for(int i = 0; i < vezes; i++){
        System.out.println(mensagem);
        }
        System.out.println(estiloBorda);
    }
    
    //Exercício 90
    public static void Somador1(int num1, int num2) {
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    
    //Exercício 91
    public static void Maior(int num1, int num2) {
        if (num1 == num2){
            System.out.println("Os dois valores são iguais");
        }else if (num1 > num2){
            System.out.println("O maior número é: "+num1);
        }else {
            System.out.println("O maior número é: "+num2);
        }
    }
    
    //Exercício 92
    public static void ParOuImpar(int num) {
        if (num % 2 == 0){
            System.out.println("O número "+num+" é PAR!");
        } else {
            System.out.println("O número "+num+" é IMPAR!");
        }
    }
    
    //Exercício 93
    public static void Gerador(int inicio,int fim,int cont) {
        System.out.println("Contagem:");
        for(int i = inicio; i < fim; i += cont){
            System.out.print(i+" >> ");
        }
        System.out.println("FIM");
    }
    
    //Exercício 94
    public static void Fibonacci(int quant) {
        int num1 = 0, num2 = 1, ProxNum = 0;
        for(int i = 0; i < quant; i++){
            ProxNum = num1 + num2;
            num1 = num2;
            num2 = ProxNum;
            System.out.print(num1+" >> ");
        }
        System.out.println("FIM");
    }
}
