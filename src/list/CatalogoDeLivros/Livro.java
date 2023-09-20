package list.CatalogoDeLivros;

public class Livro {
  private String titulo;
  private String autor;
  private int anoDePublicacao;

  public Livro(String titulo, String autor, int anoDePublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoDePublicacao = anoDePublicacao;
  }

  public int getAnoDePublicacao() {
    return anoDePublicacao;
  }

  public String getAutor() {
    return autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String toString() {
    return titulo + " " + autor + " " + anoDePublicacao;
  }
}
