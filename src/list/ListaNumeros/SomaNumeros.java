package list.ListaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Integer> listaDeNumeros;

  public SomaNumeros() {
    this.listaDeNumeros = new ArrayList<>();
  }

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(25);
    somaNumeros.adicionarNumero(15);
    somaNumeros.adicionarNumero(50);

    System.out.println(somaNumeros.encontrarMaiorNumero());
    System.out.println(somaNumeros.encontrarMenorNumero());
    System.out.println(somaNumeros.calcularSoma());
    System.out.println(somaNumeros.exibirNumeros());

  }

  public void adicionarNumero(int numero) {
    listaDeNumeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    for (Integer I : listaDeNumeros) {
      soma += I;
    }
    return soma;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = 0;
    if (!listaDeNumeros.isEmpty()) {
      for (Integer I : listaDeNumeros) {
        if (maiorNumero <= I) {
          maiorNumero = I;
        }
      }
      return maiorNumero;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    if (!listaDeNumeros.isEmpty()) {
      for (Integer I : listaDeNumeros) {
        if (menorNumero >= I) {
          menorNumero = I;
        }
      }
      return menorNumero;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Integer> exibirNumeros() {
    if (!listaDeNumeros.isEmpty()) {
      return this.listaDeNumeros;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
