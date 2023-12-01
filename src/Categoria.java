public class Categoria extends Produto {
    private String descCategoria;

    public Categoria(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual, Categoria categoria, String descCategoria) {
        super(nomeProduto, precoProduto, descProduto, estoqueAtual, categoria);
        this.descCategoria = descCategoria;
    }


    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}