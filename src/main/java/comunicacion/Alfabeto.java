package comunicacion;

public class Alfabeto extends Pictograma{
  private String[] letras;
  private String interpretacion;

  public Alfabeto(String origen, String[] letras, String interpretacion) {
    super(origen);
    this.letras = letras;
    this.interpretacion = interpretacion;
  }

  public String[] getLetras() {
    return letras;
  }

  public void setLetras(String[] letras) {
    this.letras = letras;
  }

  public String interpretacion() {
    return interpretacion;
  }

  public void setInterpretacion(String interpretacion) {
    this.interpretacion = interpretacion;
  }

  public int cantidadLetras() {
    return letras.length;
  }

  public String toString() {
    String result = "";
    for (int i = 0; i < letras.length; i++) {
      result += letras[i];
      if (i != letras.length - 1) {
        result += ", ";
      }
    }
    return result;
  }
}
