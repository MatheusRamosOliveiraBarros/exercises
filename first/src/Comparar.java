import javax.swing.JOptionPane;

public class Comparar {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Escolha um numero");
        int numero = Integer.parseInt(input);
        String input1 = JOptionPane.showInputDialog(null, "Escolha outro numero");
        int numero1 = Integer.parseInt(input1);

        if (numero == numero1) {
            JOptionPane.showMessageDialog(null, "Os  numeros sao iguais");
        } else if (numero > numero1) {
            JOptionPane.showMessageDialog(null, "O  numero " + numero + " e maior");
        } else { JOptionPane.showMessageDialog(null,"O numero " + numero1 + " e maior");

        }

    }
}