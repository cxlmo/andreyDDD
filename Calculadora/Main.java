import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        // criando o objeto calculadora
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ")
        int numero1 = entrada.nextInt();
        System.out.print("Digite outro numero: ")
        int numero2 = entrada.nextInt();

        //atribuir os valores de A e B
        calc.a = numero1;
        calc.b = numero2;

        //invocação do metodo soma
        calc.soma();

        // invocacao do metodo multiplicação
        int resultadoMultiplicacao = calc.multiplicacao();
        System.out.println("A multiplicacao foi " + resultadoMultiplicacao);

        calc.subtracao(numero1,numero2);

        int resultadoDivisao = calc.divisao(numero1,numero2);
        System.out.println("A divisao foi " + resultadoDivisao);
    }
}