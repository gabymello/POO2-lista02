
package exercicio05;

import java.util.Scanner;


public class Exercicio05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContagemPalavras ex = new ContagemPalavras();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        ex.contar(frase);
    }
    }
    

