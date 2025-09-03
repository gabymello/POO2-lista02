
package exercicio04;

import java.util.Scanner;


public class VerificacaoPalindromo {
     public void verificar(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        if (palavra.equalsIgnoreCase(invertida)) {
            System.out.println(palavra + " é um palíndromo!");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
