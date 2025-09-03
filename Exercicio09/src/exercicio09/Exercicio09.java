
package exercicio09;

import java.util.Scanner;


public class Exercicio09 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        RemocaoEspacos ex = new RemocaoEspacos();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        ex.remover(frase);
    }
    }
    

