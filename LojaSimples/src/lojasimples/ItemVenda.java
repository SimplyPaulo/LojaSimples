package lojasimples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ItemVenda {

    private Produto produtos;
    private Usuario usuario;
    private String data;
    private String hora;
    private int idVenda;

    public ItemVenda(Produto produtos, Usuario usuario) {
        this.produtos = produtos;
        this.usuario = usuario;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "produtos=" + produtos +
                ", usuario=" + usuario +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", idVenda=" + idVenda +
                '}';
    }

    public int gerarId(){
        Random gerador = new Random();

        return gerador.nextInt(100000000);
    }

    public void gerarExtrato(){
        Date dataHoraAtual = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        setData(data);
        setHora(hora);
        setIdVenda(gerarId());

        System.out.println(
                "Id da venda: "+getIdVenda()+
                "\nProdutos: "+
                        "\n     Nome do produto: "+getProdutos().getNome()+
                        "\n     Preço: "+getProdutos().getPreco()+
                        "\n     Quantidade: "+getProdutos().getQuantidade()+
                "\nInformações do usuario comprador: "+
                        "\n     Nome: "+getUsuario().getNome()+
                        "\n     cpf: "+getUsuario().getCpf()+
                        "\n     email: "+getUsuario().getEmail()+
                "\nData: "+ getData()+
                "\nHora: "+ getHora()

        );
    }
}
