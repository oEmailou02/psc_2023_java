import java.util.Scanner;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
    public static void main(String [] args){
        //declarando variável
        Scanner leitor = new Scanner(System.in);

        double primeiroOperando;
        double segundoOperando;
        double resultado;

        //entrada
        System.out.println("Digite o primeiro operando: ");
        primeiroOperando = leitor.nextDouble();
        System.out.println("Digite o segundo operando: ");
        segundoOperando = leitor.nextDouble();

        //processamento
        resultado = primeiroOperando + segundoOperando;

        //saida
        System.out.print(resultado);
    }
}