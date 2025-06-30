import javax.swing.JOptionPane;

public class Main {
    public static void main(String[]args){

        int resposta = JOptionPane.showConfirmDialog(null,"Ola seu nome e Matheus");

        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Certo, Matheus");

        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Ok, me desculpe");

        }

    }
}