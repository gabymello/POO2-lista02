
package exercicio010;

import java.util.Scanner;


public class Exercicio010 {

  
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        ContagemVogaisConsoantes ex = new ContagemVogaisConsoantes();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        ex.contar(palavra);
    }
    }
    

