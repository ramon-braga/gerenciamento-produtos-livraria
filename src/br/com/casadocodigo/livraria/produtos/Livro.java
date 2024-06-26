package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-0000-00-0";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }

        System.out.println("--");
    }

    boolean temAutor() {
        return this.autor != null;
    }

}
