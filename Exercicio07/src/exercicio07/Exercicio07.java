
package exercicio07;

import java.util.Scanner;


public class Exercicio07 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExtracaoDominio ex = new ExtracaoDominio();

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        ex.extrair(email);
    }
    }
    

