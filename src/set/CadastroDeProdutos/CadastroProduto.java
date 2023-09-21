package set.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
  private Set<Produto> listaDeProdutos;

  public static void main(String[] args) {
    CadastroProduto cadastroProduto = new CadastroProduto();
    cadastroProduto.adicionarProduto(1, "C", 1.2, 5);
    cadastroProduto.adicionarProduto(2, "B", 5.1, 5);
    cadastroProduto.adicionarProduto(3, "E", 4.5, 1);
    cadastroProduto.adicionarProduto(4, "A", 100.2, 100);
    cadastroProduto.adicionarProduto(5, "I", 10.1, 5);
    cadastroProduto.adicionarProduto(6, "J", 10.2, 5);
    System.out.println(cadastroProduto.exibirPorPreço());
    System.out.println(cadastroProduto.exibirProdutosPorNome());

  }

  public CadastroProduto() {
    this.listaDeProdutos = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    listaDeProdutos.add(new Produto(nome, cod, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtoPorNome = new TreeSet<>(listaDeProdutos);
    return produtoPorNome;
  }

  public Set<Produto> exibirPorPreço() {
    Set<Produto> produtoPorPreco = new TreeSet<>(new CompararPorPreco());
    produtoPorPreco.addAll(listaDeProdutos);
    return produtoPorPreco;
  }
}
