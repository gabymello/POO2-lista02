
package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificacaoPalindromo ex = new VerificacaoPalindromo();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        ex.verificar(palavra);
    }
    }
    

