package map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> listaDeProdutos;

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
    {
      estoqueProdutos.adicionarProduto(131415, "Banana", 5, 1.22);
      estoqueProdutos.adicionarProduto(13, "Maça", 3, 3);
      estoqueProdutos.adicionarProduto(14, "Abacate", 5, 7);
      estoqueProdutos.adicionarProduto(15, "Abobora", 2, 15);
      estoqueProdutos.adicionarProduto(17, "Leite", 10, 5);
      estoqueProdutos.exibirProdutos();
      System.out.println(estoqueProdutos.calcularValorTotalEstoque());
      System.out.println(estoqueProdutos.obterProdutoMaisBarato());
      System.out.println(estoqueProdutos.obterProdutoMaisCaro());
      System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
      System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoqueProduto());

    }
  }

  public EstoqueProdutos() {
    this.listaDeProdutos = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    listaDeProdutos.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(listaDeProdutos);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if (!listaDeProdutos.isEmpty()) {
      for (Produto p : listaDeProdutos.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorValor = Double.MIN_VALUE;
    if (!listaDeProdutos.isEmpty()) {
      for (Produto P : listaDeProdutos.values())
        if (P.getPreco() > maiorValor) {
          produtoMaisCaro = P;
          maiorValor = P.getPreco();
        }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorValor = Double.MAX_VALUE;
    if (!listaDeProdutos.isEmpty()) {
      for (Produto P : listaDeProdutos.values()) {
        if (P.getPreco() < menorValor) {
          produtoMaisBarato = P;
          menorValor = P.getPreco();
        }
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!listaDeProdutos.isEmpty()) {
      for (Map.Entry<Long, Produto> entry : listaDeProdutos.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoqueProduto() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!listaDeProdutos.isEmpty()) {
      for (Produto P : listaDeProdutos.values()) {
        double valorProdutoEmEstoque = P.getPreco() * P.getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = P;
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }
}
