package lojasimples;


import lojasimples.ItemVenda;

public class Venda {

    private Produto produto;
    private Usuario usuario;

    public Venda() {
        this.produto = produto;
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produto=" + produto +
                ", usuario=" + usuario +
                '}';
    }

    public void realizarVenda(Produto produto, Usuario usuario){
        ItemVenda venda = new ItemVenda(produto, usuario);
        venda.gerarExtrato();
    }
}
