import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int numero = 0;
        boolean acertou = false;


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 0 a 100:");
             numero = leitura.nextInt();
             if (numero < 0 || numero > 100) {
                 System.out.println("ERRO: Digite um numero entre 0 a 100:");
                 i--;
                 continue;
             }

             if (numeroSorteado == numero) {
                 System.out.println("Parabêns você acertou!");
                 break;

             } else if (numeroSorteado < numero) {
                 System.out.println("O numero é menor");

             }else{
                 System.out.println("O numero é maior");

             }

             }
        if (numeroSorteado == numero) {
            System.out.println("Parabéns você acertou!");
            acertou = true;
        }else{
            System.out.println("o numero era: " + numeroSorteado);
             }



        }
}



