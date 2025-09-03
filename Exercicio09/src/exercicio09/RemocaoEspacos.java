
package exercicio09;


public class RemocaoEspacos {
    public void remover(String frase) {
        String formatada = frase.trim().replaceAll("\\s+", " ");
        System.out.println("Frase sem espaços extras: " + formatada);
    }
}
