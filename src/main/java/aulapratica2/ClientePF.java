package aulapratica2;

public class ClientePF extends Cliente{ /* herdei da classe Cliente*/

    private String cpf;

    public ClientePF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf=cpf;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCnpj(String cpf) {
        this.cpf=cpf;
    }

    public String toString() {
        return super.toString() +"cpf: "+cpf;
    }
}
