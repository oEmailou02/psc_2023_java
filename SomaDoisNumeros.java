import javax.swing.JOptionPane;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
    public static void main(String [] args){
        //declarando variável

        double primeiroOperando;
        double segundoOperando;
        double resultado;

        //entrada
        primeiroOperando = Double.parseDouble (JOptionPane.showInputDialog("Digite o primeiro operando: "));
        
        segundoOperando = Double.parseDouble (JOptionPane.showInputDialog("Digite o segundo operando "));

        //processamento
        resultado = primeiroOperando + segundoOperando;

        //saida
        JOptionPane.showMessageDialog(null, resultado);
    }
}