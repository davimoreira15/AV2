import java.util.ArrayList;
import java.util.Date;




    public class Pedido {
        private int numeroPedido;
        private Date dataHoraPedido;
        private double precoTotal;
        private int statusPedido;
        private ArrayList<PedidoItem> itensPedido;

        public Pedido(int numeroPedido) {
            this.numeroPedido = numeroPedido;
            this.dataHoraPedido = new Date(); // Data e hora atuais
            this.precoTotal = 0; // Valor inicial zerado
            this.statusPedido = 1; // Status padrão é 1
            this.itensPedido = new ArrayList<>();
        }

        public void inserirItensPedido(PedidoItem item) {
            this.itensPedido.add(item);
        }


        public void excluirItensPedido(PedidoItem item) {
            this.itensPedido.remove(item);
        }


        public double calculaTotalPagar() {
            double total = 0;
            for (PedidoItem item : itensPedido) {
                total += item.getPrecoItem();
            }
            this.precoTotal = total;
            return total;
        }

        public void alterarStatus(int novoStatus) {
            this.statusPedido = novoStatus;
        }


        public boolean consultarPedido(Pedido pedido) {
            return this.numeroPedido == pedido.getNumeroPedido();
        }



    }
