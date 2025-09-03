
package exercicio08;


public class MascaramentoInfo {
    public void mascarar(String cartao) {
        if (cartao == null) {
            System.out.println("Entrada inválida!");
            return;
        }

        int n = cartao.length();
        if (n <= 4) {
            System.out.println("Número inválido!");
            return;
        }

        String ultimos4 = cartao.substring(n - 4);
        StringBuilder mascarado = new StringBuilder();

        // substitui o repeat por um loop (compatível com Java 8)
        for (int i = 0; i < n - 4; i++) {
            mascarado.append('*');
        }
        mascarado.append(ultimos4);

        System.out.println("Cartão mascarado: " + mascarado.toString());
    }
}
