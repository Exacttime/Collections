package map.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> listaDeContatos;

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionarContato("Erick", 123);
    agendaContatos.adicionarContato("Erick", 123455); // Replace/Atualiza
    agendaContatos.adicionarContato("Joao", 12555123);
    agendaContatos.adicionarContato("Pedro", 122453);
    agendaContatos.adicionarContato("Larissa", 12314);
    agendaContatos.adicionarContato("Marcela", 167723);
    agendaContatos.exibirContatos();
    agendaContatos.removerContato("Larissa");
    agendaContatos.exibirContatos();
    System.out.println(agendaContatos.pesquisarPorNome("Erick"));

  }

  public AgendaContatos() {
    this.listaDeContatos = new HashMap<>();
  }

  public void adicionarContato(String nome, int telefone) {
    listaDeContatos.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!listaDeContatos.isEmpty()) {
      listaDeContatos.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(listaDeContatos);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer telefoneDoContato = null;
    if (!listaDeContatos.isEmpty()) {
      telefoneDoContato = listaDeContatos.get(nome);
    }
    return telefoneDoContato;
  }
}
