package aulapratica2;

import aulapratica1.Pessoa;

public class ClienteApp {

    public static void main(String[] args) {

        ClientePF clientepf1 = new ClientePF(" Robinson Alves Dias\n", " Jardim Morada do Sol\n",
                " 111222333-4\n");

        ClientePJ clientepj1 = new ClientePJ(" Domenico de Bastos\n", " Residencial das Tulipas\n",
                " 00001245788921-20\n");

        System.out.println("Dados do cliente PF: " +clientepf1.getNome() + " "
                +clientepf1.getEndereco() + " " +clientepf1.getCpf());

        System.out.println("Dados do cliente PJ: " +clientepj1.getNome() + " "
                +clientepj1.getEndereco() + " " +clientepj1.getCnpj());

        System.out.println(clientepf1.toString());
        System.out.println(clientepj1.toString());

    }

}
