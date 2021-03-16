package aulapratica1;

public class PessoaApp {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(1, "Elder"); /* nome instansciado errado, sem o H*/

        Pessoa pessoa2 = new Pessoa(2, "Ana");

        System.out.println("O nome do objeto pessoa eh: " +pessoa1.getNome());

        pessoa1.setNome(("Helder")); /* aqui vc invoca o metodo para a correcao do nome*/

        System.out.println("O nome do objeto pessoa eh: " +pessoa1.getNome());


        /* get - retorna o atributo.
        set - modifica o atributo
         */



    }
}
