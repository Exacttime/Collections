package set.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> listaDeAlunos;

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    gerenciadorAlunos.adicionarAluno("Arthur", 1232, 9);
    gerenciadorAlunos.adicionarAluno("Erick", 1212, 9);
    gerenciadorAlunos.adicionarAluno("Enzo", 14, 10);
    gerenciadorAlunos.adicionarAluno("Maria", 15, 8.1);
    gerenciadorAlunos.adicionarAluno("Joao", 1515, 2.1);
    gerenciadorAlunos.adicionarAluno("Pedro", 1616, 3.4);
    gerenciadorAlunos.adicionarAluno("Lucas", 1313, 9.3);
    gerenciadorAlunos.adicionarAluno("Fernando", 1718, 9.4);
    gerenciadorAlunos.exibirAlunos();
    gerenciadorAlunos.removerAluno(1718);
    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

  }

  public GerenciadorAlunos() {
    this.listaDeAlunos = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, double media) {
    listaDeAlunos.add(new Aluno(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    for (Aluno A : listaDeAlunos) {
      if (A.getMatricula() == matricula) {
        listaDeAlunos.remove(A);
        break;
      }
    }
  }

  public Set<Aluno> exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(listaDeAlunos);
    return alunosPorNome;
  }

  public Set<Aluno> exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
    alunosPorNota.addAll(listaDeAlunos);
    return alunosPorNota;
  }

  public void exibirAlunos() {
    System.out.println(listaDeAlunos);
  }
}
