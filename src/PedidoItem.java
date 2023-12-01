public class PedidoItem {

    private String nomeItem;
    private int qtdeItem;
    private double precoItem;

    public PedidoItem(String nomeItem, int qtdeItem, double precoItem) {
        this.nomeItem = nomeItem;
        this.qtdeItem = qtdeItem;
        this.precoItem = precoItem;
    }


    public boolean atualizaEstoqueItem(Produto produto) {
        if (produto != null && produto.getEstoqueAtual() >= qtdeItem) {
            produto.setEstoqueAtual(produto.getEstoqueAtual() - qtdeItem);
            return true;
        }
        return false;
    }


}
