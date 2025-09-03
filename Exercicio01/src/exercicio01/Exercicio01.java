
package exercicio01;

import java.util.Scanner;


public class Exercicio01 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ContagemLetras ex = new ContagemLetras();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        ex.contar(palavra);
    }
}
  