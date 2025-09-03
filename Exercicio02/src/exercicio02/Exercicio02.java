
package exercicio02;

import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubstituicaoCaracteres ex = new SubstituicaoCaracteres();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        ex.substituir(frase);
    }
    
}
