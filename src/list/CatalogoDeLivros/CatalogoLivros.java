package list.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> listaDeLivros;

  public CatalogoLivros() {
    this.listaDeLivros = new ArrayList<>();
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Amor", "Jonas", 2012);
    catalogoLivros.adicionarLivro("Ficção", "Marcelo", 2010);
    catalogoLivros.adicionarLivro("Romance", "Julia", 2001);
    catalogoLivros.adicionarLivro("Tudo De Bom", "Pedro", 2013);
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor1"));
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2010));
    System.out.println(catalogoLivros.pesquisarPorTitulo("Romance"));

  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> autoresList = new ArrayList<>();
    if (!listaDeLivros.isEmpty()) {
      for (Livro L : listaDeLivros) {
        if (L.getAutor().equalsIgnoreCase(autor)) {
          autoresList.add(L);
        }
      }
    }
    return autoresList;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> listaDeIntervalo = new ArrayList<>();
    if (!listaDeLivros.isEmpty()) {
      for (Livro L : listaDeLivros) {
        if (L.getAnoDePublicacao() >= anoInicial && L.getAnoDePublicacao() <= anoFinal) {
          listaDeIntervalo.add(L);
        }
      }
    }
    return listaDeIntervalo;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!listaDeLivros.isEmpty()) {
      for (Livro L : listaDeLivros) {
        if (L.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = L;
          break;
        }
      }
    }
    return livroPorTitulo;
  }
}
