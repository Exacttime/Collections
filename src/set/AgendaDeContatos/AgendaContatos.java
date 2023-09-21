package set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> listaDeContatos;

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionarContato("Erick", 1304);
    agendaContatos.adicionarContato("Enzo", 0413);
    agendaContatos.adicionarContato("Lucas", 130000);
    agendaContatos.adicionarContato("Joao", 9382);
    agendaContatos.adicionarContato("Erickenzo", 49883);
    agendaContatos.exibirContatos();
    System.out.println(agendaContatos.pesquisarPorNome("Erick"));
    agendaContatos.atualizarNumeroContato("Erick", 333333333);
    System.out.println(agendaContatos.pesquisarPorNome("Erick"));
    agendaContatos.exibirContatos();

  }

  public AgendaContatos() {
    this.listaDeContatos = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    listaDeContatos.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(listaDeContatos);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> listaDeContatosEncontrados = new HashSet<>();
    for (Contato C : listaDeContatos) {
      if (C.getNome().startsWith(nome)) {
        listaDeContatosEncontrados.add(C);
      }
    }
    return listaDeContatosEncontrados;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!listaDeContatos.isEmpty()) {
      for (Contato C : listaDeContatos) {
        if (C.getNome().equalsIgnoreCase(nome)) {
          C.setNumeroDeTelefone(novoNumero);
          break;
        }
      }
    }
    return contatoAtualizado;
  }
}
