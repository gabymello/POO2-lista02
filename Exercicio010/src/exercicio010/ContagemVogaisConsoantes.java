
package exercicio010;


public class ContagemVogaisConsoantes {
     public void contar(String palavra) {
        palavra = palavra.toLowerCase().replaceAll("[^a-z]", "");
        int vogais = 0, consoantes = 0;

        for (char c : palavra.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            } else {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais + ", Consoantes: " + consoantes);
    }
}

