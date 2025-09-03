
package exercicio07;


public class ExtracaoDominio {
     public void extrair(String email) {
        if (email.contains("@")) {
            String dominio = email.substring(email.indexOf("@") + 1);
            System.out.println("Domínio: " + dominio);
        } else {
            System.out.println("Email inválido!");
        }
    }
}
