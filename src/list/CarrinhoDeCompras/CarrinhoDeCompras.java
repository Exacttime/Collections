package list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> listaDeItens;

  public CarrinhoDeCompras() {
    listaDeItens = new ArrayList<>();
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    carrinhoDeCompras.adicionarItem("Maça", 9, 2);
    carrinhoDeCompras.adicionarItem("Banana", 10, 2);
    carrinhoDeCompras.adicionarItem("Todinho", 2, 2);
    carrinhoDeCompras.removerItem("Todinho");
    System.out.println("A compra ficou em: " + carrinhoDeCompras.calcularValorTotal());
    carrinhoDeCompras.exibirItens();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    listaDeItens.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList();
    for (Item e : listaDeItens) {
      if (e.getNome().equals(nome)) {
        itensParaRemover.add(e);
      }
    }
    listaDeItens.removeAll(itensParaRemover);
  }

  public double calcularValorTotal() {
    double total = 0;
    for (Item i : listaDeItens) {
      total += i.getPreco() * i.getQuantidade();
    }
    return total;
  }

  public void exibirItens() {
    System.out.println(listaDeItens);
  }
}
