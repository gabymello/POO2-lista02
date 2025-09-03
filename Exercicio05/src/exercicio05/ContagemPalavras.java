
package exercicio05;


public class ContagemPalavras {
     public void contar(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("Quantidade de palavras: " + palavras.length);
    } 
}
