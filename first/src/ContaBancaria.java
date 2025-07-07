import javax.swing.JOptionPane;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Matheus Ramos";
        String conta = "Corrente";
        double saldo = 2500.00;

        String mensagemInicial =
                "******************************\n"
                        + "Dados iniciais do cliente\n\n"
                        + "Seu nome: " + nome + "\n"
                        + "Tipo de conta: " + conta + "\n"
                        + "Seu saldo atual: R$ " + String.format("%.2f", saldo) + "\n"
                        + "******************************";

        JOptionPane.showMessageDialog(null, mensagemInicial);

        String menu =
                "Escolha uma opção:\n\n"
                        + "1 - Consultar Dados\n"
                        + "2 - Receber Valor\n"
                        + "3 - Transferir Valor\n"
                        + "4 - SAIR";

        String opcao = JOptionPane.showInputDialog(null, menu, "Menu do cliente", JOptionPane.QUESTION_MESSAGE);

        if (opcao != null) {
            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null,
                            "Nome do Cliente: " + nome + "\n"
                                    + "Tipo de conta: " + conta + "\n"
                                    + "Saldo: R$ " + String.format("%.2f", saldo));
                    break;

                case "2":
                    String valorStr = JOptionPane.showInputDialog(null, "Digite o valor a receber em R$");
                    if (valorStr != null) {
                        double valor = Double.parseDouble(valorStr);
                        saldo += valor;
                        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + String.format("%.2f", saldo));
                    }
                    break;

                case "3":
                    String valorMenos = JOptionPane.showInputDialog(null, "Digite o valor a transferir em R$");
                    if (valorMenos != null) {
                        double valor = Double.parseDouble(valorMenos);
                        if (valor > saldo) {
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                        } else {
                            saldo -= valor;
                            JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + String.format("%.2f", saldo));
                        }
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Encerrando...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
