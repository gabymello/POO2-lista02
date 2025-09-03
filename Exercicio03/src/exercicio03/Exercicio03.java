
package exercicio03;

import java.util.Scanner;


public class Exercicio03 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        InversaoPalavra ex = new InversaoPalavra();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        ex.inverter(palavra);
    }
    }
    

