package set.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> conjuntoDePalavras;

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
    conjuntoPalavrasUnicas.adicionarPalavra("Erick");
    conjuntoPalavrasUnicas.adicionarPalavra("Enzo");
    conjuntoPalavrasUnicas.adicionarPalavra("Maria");
    conjuntoPalavrasUnicas.adicionarPalavra("LEGAL");
    conjuntoPalavrasUnicas.verificarPalavra("LEGAL");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    conjuntoPalavrasUnicas.removerPalavra("legal");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
  }

  public ConjuntoPalavrasUnicas() {
    this.conjuntoDePalavras = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    conjuntoDePalavras.add(palavra);
  }

  public void removerPalavra(String palavraParaRemover) {
    for (String S : conjuntoDePalavras) {
      if (S.equalsIgnoreCase(palavraParaRemover)) {
        palavraParaRemover = S;
        break;
      }
    }
    conjuntoDePalavras.remove(palavraParaRemover);
  }

  public void verificarPalavra(String palavraParaVerificar) {
    if (conjuntoDePalavras.contains(palavraParaVerificar)) {
      System.out.println("A palavra : " + palavraParaVerificar + " Está presente");
    } else {
      System.out.println("A palavra : " + palavraParaVerificar + " não está presente");
    }
  }

  public void exibirPalavrasUnicas() {
    System.out.println(conjuntoDePalavras);
  }
}
