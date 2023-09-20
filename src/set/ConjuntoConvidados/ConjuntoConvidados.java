package set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  private Set<Convidado> convidadoSet;

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    conjuntoConvidados.adicionarConvidado("Ruan", 123);
    conjuntoConvidados.adicionarConvidado("Maria", 23);
    conjuntoConvidados.adicionarConvidado("Pedro", 342);
    conjuntoConvidados.exibirConvidados();
    conjuntoConvidados.contarConvidados();
    conjuntoConvidados.removeConvidado(23);
    conjuntoConvidados.exibirConvidados();
    conjuntoConvidados.contarConvidados();

  }

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removeConvidado(int codigoConvite) {
    Convidado convidadoParaRemover = null;

    for (Convidado I : convidadoSet) {
      if (I.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = I;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }
}
