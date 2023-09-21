package map.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> listaDePalavras;

  public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();
    contagemPalavras.adicionarPalavra("Palavra1", 0);
    contagemPalavras.adicionarPalavra("Palavra1", 1);
    contagemPalavras.adicionarPalavra("Palavra2", 3);
    contagemPalavras.adicionarPalavra("Palavra3", 4);
    contagemPalavras.adicionarPalavra("Palavra3", 0);
    contagemPalavras.adicionarPalavra("Palavra3", 0);
    System.out.println(contagemPalavras.exibirContagemPalavras());
    System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

  }

  public ContagemPalavras() {
    this.listaDePalavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, int contagem) {
    listaDePalavras.put(palavra, contagem);
  }

  public void removerPalavra(String palavra) {
    listaDePalavras.remove(palavra);
  }

  public int exibirContagemPalavras() {
    int contagemTotal = 0;
    for (int contagem : listaDePalavras.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavraMaisFrequente() {
    String palavraMaisFrequente = null;
    int maiorContagem = 0;
    if (!listaDePalavras.isEmpty()) {
      for (Map.Entry<String, Integer> entry : listaDePalavras.entrySet()) {
        if (entry.getValue() > maiorContagem) {
          maiorContagem = entry.getValue();
          palavraMaisFrequente = entry.getKey();
        }
      }
    }
    return palavraMaisFrequente;
  }
}
