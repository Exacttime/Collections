package set.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> listaDeTarefas;

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();
    listaTarefas.adicionarTarefa("Limpar sala");
    listaTarefas.adicionarTarefa("Lavar pratos");
    listaTarefas.adicionarTarefa("Limpar quarto");
    listaTarefas.adicionarTarefa("Limpar cozinha");
    listaTarefas.adicionarTarefa("Lavar Banheiro");
    listaTarefas.adicionarTarefa("Cozinhar");
    listaTarefas.adicionarTarefa("Limpar casa do cachorro");
    listaTarefas.exibirTarefas();
    System.out.println(listaTarefas.contarTarefas());
    listaTarefas.removerTarefa("Cozinhar");
    listaTarefas.exibirTarefas();
    System.out.println(listaTarefas.contarTarefas());
    listaTarefas.marcarTarefaConcluida("Lavar pratos");
    listaTarefas.marcarTarefaConcluida("Lavar Banheiro");
    System.out.println("Lista de tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
    System.out.println("Lista de tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
    listaTarefas.marcarTarefaPendente("Lavar pratos");
    System.out.println("Lista de tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();

  }

  public ListaTarefas() {
    this.listaDeTarefas = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    listaDeTarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    for (Tarefa T : listaDeTarefas) {
      if (T.getDescricao().equalsIgnoreCase(descricao)) {
        listaDeTarefas.remove(T);
        break;
      }
    }
  }

  public void exibirTarefas() {
    System.out.println(listaDeTarefas);
  }

  public int contarTarefas() {
    return listaDeTarefas.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> listaDeTarefasConcluidas = new HashSet<>();
    for (Tarefa T : listaDeTarefas) {
      if (T.isTarefaConcluida()) {
        listaDeTarefasConcluidas.add(T);
      }
    }
    return listaDeTarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> listaDeTarefasPendentes = new HashSet<>();
    for (Tarefa T : listaDeTarefas) {
      if (!T.isTarefaConcluida()) {
        listaDeTarefasPendentes.add(T);
      }
    }
    return listaDeTarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa T : listaDeTarefas) {
      if (T.getDescricao().equalsIgnoreCase(descricao)) {
        T.setTarefaConcluida(true);
        break;
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for (Tarefa T : listaDeTarefas) {
      if (T.getDescricao().equalsIgnoreCase(descricao)) {
        T.setTarefaConcluida(false);
        break;
      }
    }
  }

  public void limparListaTarefas() {
    listaDeTarefas.clear();
  }
}
