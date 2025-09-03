
package exercicio08;

import java.util.Scanner;


public class Exercicio08 {

    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        MascaramentoInfo ex = new MascaramentoInfo();

        System.out.print("Digite o número do cartão: ");
        String cartao = sc.nextLine();

        ex.mascarar(cartao);
    }
}

