package compras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> comprasList;

    public CarrinhoDeCompras(){
        this.comprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.comprasList.add(item);
    }
    public void removerItem(String nome){
        List<Item> comprasParaRemover = new ArrayList<>();
        if(!comprasList.isEmpty()){
            for(Item i : comprasList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    comprasParaRemover.add(i);
            }
        }
        comprasList.removeAll(comprasParaRemover);
    } else{
        System.out.println("A lista está vazia!");
    }
}
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!comprasList.isEmpty()){
            for(Item item : comprasList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        return valorTotal;
    } else{
        throw new RuntimeException("A lista está vazia!");
    }
}
    public void exibirItens(){
        if(!comprasList.isEmpty()){
        System.out.println(this.comprasList);
    } else{
        System.out.println("A lista está vazia!");
    }
}
    public String toString(){
        return "CarrinhoDeCompras{" +
            "itens=" + comprasList +
            '}';
    }

    public static void main(String[] args) {
        //criando uma insância ao carrinho
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        //Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 4d, 5);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 2);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 3);

        //Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        //removendo um item do carrinho
        carrinhoDeCompras.removerItem("Caneta");

        //exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        //Calculando e exibindo o valor total de compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        
    }
    
}
