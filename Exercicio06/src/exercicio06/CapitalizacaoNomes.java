
package exercicio06;


public class CapitalizacaoNomes {
   public void capitalizar(String nomeCompleto) {
        String[] partes = nomeCompleto.toLowerCase().split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String parte : partes) {
            resultado.append(Character.toUpperCase(parte.charAt(0)))
                     .append(parte.substring(1)).append(" ");
        }

        System.out.println("Nome formatado: " + resultado.toString().trim());
    } 
}
