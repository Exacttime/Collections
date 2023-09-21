package set.ListaDeTarefas;

public class Tarefa {
  private String descricao;
  private boolean tarefaConcluida = false;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "descricao= " + descricao + ":  tarefaConcluida= " + tarefaConcluida;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isTarefaConcluida() {
    return tarefaConcluida;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setTarefaConcluida(boolean tarefaConcluida) {
    this.tarefaConcluida = tarefaConcluida;
  }

}
