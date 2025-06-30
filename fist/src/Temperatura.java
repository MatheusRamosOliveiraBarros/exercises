import javax.swing.JOptionPane;

public class Temperatura {
    public static void main(String[] args) {

        String graus = JOptionPane.showInputDialog(null,"Quantos graus você quer converter?");;
        double celsius = Double.parseDouble(graus);
        double fahrenheit = celsius * 1.8 + 32;

        JOptionPane.showMessageDialog(null,"Em Fahrenheit:"+ fahrenheit );

    }

}
