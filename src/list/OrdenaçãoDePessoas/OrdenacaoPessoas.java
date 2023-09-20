package list.OrdenaçãoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  private List<Pessoa> listaDePessoas;

  public OrdenacaoPessoas() {
    this.listaDePessoas = new ArrayList<>();
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("Erick", 20, 1.64);

    ordenacaoPessoas.adicionarPessoa("Joao", 10, 1.60);
    ordenacaoPessoas.adicionarPessoa("Pedro", 15, 1.70);
    ordenacaoPessoas.adicionarPessoa("Antonio", 19, 1.90);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());

  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    listaDePessoas.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> listaPorIdade = new ArrayList<>(listaDePessoas);
    Collections.sort(listaPorIdade);
    return listaPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> listaPorAltura = new ArrayList<>(listaDePessoas);
    Collections.sort(listaPorAltura, new CompararPorAltura());
    return listaPorAltura;
  }
}
