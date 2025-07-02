import javax.swing.JOptionPane;


public class PostivoNegativo {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um numero: ");
        int numero = Integer.parseInt(input);

        if (numero > 0){
            JOptionPane.showMessageDialog(null, "Esse numero é positivo");

        }else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Esse numero é negativo");

        }else{
            JOptionPane.showMessageDialog(null,"Esse numero e zero");
        }

        System.exit(0);



    }
}
