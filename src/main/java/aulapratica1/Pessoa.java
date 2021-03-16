package aulapratica1;

public class Pessoa {

    private int codigo; /* atributos privados*/
    private String nome;

    public Pessoa(int codigo, String nome){ /* metodo construtor*/
        this.codigo=codigo;
        this.nome=nome;
    }

    public String getNome() { /* metodo que acessa o atributo e retorna o atributo nome nesse exemplo */
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
