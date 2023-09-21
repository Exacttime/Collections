package map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> palavras;

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();
    dicionario.adicionarPalavra("Cor", "Azul, somente vista por conta da luz\n");
    dicionario.adicionarPalavra("Carro", "Automovel para transporte que tras segurança\n");
    dicionario.adicionarPalavra("Escola", "Local para aprendizado\n");
    dicionario.adicionarPalavra("Hospital", "Local para melhorar\n");
    dicionario.adicionarPalavra("Mecanico", "Profissão de quem conserta automoveis\n");
    dicionario.exibirPalavras();
    dicionario.removerPalavra("Hospital");
    dicionario.exibirPalavras();
    System.out.println(dicionario.pesquisarPalavra("Carro"));

  }

  public Dicionario() {
    this.palavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    palavras.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!palavras.isEmpty()) {
      palavras.remove(palavra);
    }
  }

  public void exibirPalavras() {
    System.out.println(palavras);
  }

  public String pesquisarPalavra(String palavra) {
    String definicao = null;
    if (!palavras.isEmpty()) {
      definicao = palavras.get(palavra);
    }
    return definicao;
  }
}
