
package exercicio02;


public class SubstituicaoCaracteres {
      public void substituir(String frase) {
        String resultado = frase.replace('a', '*').replace('A', '*');
        System.out.println("Frase modificada: " + resultado);
    }
}
