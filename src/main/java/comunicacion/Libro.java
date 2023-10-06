package comunicacion;

public class Libro extends Escrito{
  private String co_autor;
  private String editorial;
  private String edicion;
  private String interpretacion;

  public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
    super(origen, titulo, autor, paginas);
    this.co_autor = co_autor;
    this.editorial = editorial;
    this.edicion = edicion;
    this.interpretacion = interpretacion;
  }
  
  public String getCo_autor() {
    return co_autor;
  }

  public void setCo_autor(String co_autor) {
    this.co_autor = co_autor;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public String getEdicion() {
    return edicion;
  }

  public void setEdicion(String edicion) {
    this.edicion = edicion;
  }

  public String interpretacion() {
    return interpretacion;
  }

  public void setInterpretacion(String interpretacion) {
    this.interpretacion = interpretacion;
  }

  public String toString() {
    return "Título: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n" + "Paginas: " + getPaginas() + "\n" + "Co-Autor: " + co_autor + "\n" + "Editorial: " + editorial + "\n" + "Edicion: " + edicion;
  }

  public int palabrasTotales(int palabrasPagina) {
    return getPaginas() * palabrasPagina * 2;
  }

  public String cantidadDeLetras() {
    return getTitulo().length() + getAutor().length() + "";
  }

}
