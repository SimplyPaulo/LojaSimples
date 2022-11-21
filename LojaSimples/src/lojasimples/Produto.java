package lojasimples;

public class Produto {

    private String nome;
    private Double preco;
    private int Quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        Quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", Quantidade=" + Quantidade +
                '}';
    }
}
