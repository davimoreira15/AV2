import java.util.ArrayList;


public class Main {




        public static void main(String[] args) {

            ArrayList<Produto> Produtos = new ArrayList<>();

           Produtos.add(new Produto("Mouse", 10.0, "mouse sem fio", 100, new Categoria("computação", 10.0, "rápido e eficiente", 50, null, "Categoria")));
           Produtos.add(new Produto("Teclado", 20.0, "teclado sem fio", 50, new Categoria("computação", 10.0, "rápido e eficiente", 50, null, "Categoria")));
           Produtos.add(new Produto("Monitor", 300.0, "monitor LG", 200, new Categoria("computação", 500, "Tela full Hd, eficiente para jogos", 50, null, "Categoria")));
           Produtos.add(new Produto("Cadeira de escritório", 200.0, "para escritorio", 100, new Categoria("mobilia", 300.0, "comfortavel e duravel", 50, null, "Categoria")));
           Produtos.add(new Produto("SSD", 120.0, "periferico informatica", 40, new Categoria("computação", 120.0, "melhor que seu hd", 50, null, "Categoria")));


            ArrayList<Pedido> Pedidos = new ArrayList<>();

            Pedido p1 = new Pedido(1);
            Pedido p2 = new Pedido(2);

            //INSERINDO ITEMS NOS PEDIDOS

            p1.inserirItensPedido("MOUSE", 15, 10.00);
            p1.inserirItensPedido("TECLADO", 5, 20.00);
            p1.inserirItensPedido("MONITOR", 1, 300.00);

            p2.inserirItensPedido("SSD", 15, 120.00);
            p2.inserirItensPedido("CADEIRA", 3, 200.00);
            p2.inserirItensPedido("MESA", 1, 155.00);

            p1. calculaTotalPagar();
            p2. calculaTotalPagar();

        }

    }
