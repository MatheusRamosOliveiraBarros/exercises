import javax.swing.JOptionPane;
import java.util.Scanner;

public class media {
    public static void main(String args[]){

        String primeiraNota = JOptionPane.showInputDialog("Digite o primeira nota: ");
        String segundaNota = JOptionPane.showInputDialog("Digite o segunda nota: ");

        double nota1 = Double.parseDouble(primeiraNota);
        double nota2 = Double.parseDouble(segundaNota);
        double resultado = (nota1 + nota2) / 2;
        JOptionPane.showMessageDialog(null,resultado);
    }
}
