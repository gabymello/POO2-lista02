
package exercicio03;

/**
 *
 * @author gabri
 */
public class InversaoPalavra {
     public void inverter(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("Palavra invertida: " + invertida);
    }
}