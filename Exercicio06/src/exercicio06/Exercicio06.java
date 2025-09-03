
package exercicio06;

import java.util.Scanner;


public class Exercicio06 {

    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        CapitalizacaoNomes ex = new CapitalizacaoNomes();

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        ex.capitalizar(nome);
    }
    }
    

