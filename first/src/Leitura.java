import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme:");
        String filme = leitura.nextLine();
        System.out.println(filme);

        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação");
        double avaliacao = leitura.nextDouble();
    }
}
