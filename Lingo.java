import java.util.Scanner;

public class Lingo {
  private static Scanner in = new Scanner(System.in);
  private String palabraSecreta;
  private String palabraGuiada;
  private int intentos;

  public static void main(String[] args) {
    Lingo lingo = new Lingo();
    lingo.jugar();
  }

  public Lingo() {
    this.palabraSecreta = "";
    this.palabraGuiada = "";
    this.intentos = 5;
  }

  public void jugar() {
    palabraSecreta = leerPalabra();

    for (int i = 0; i < palabraSecreta.length(); i++) {
      palabraGuiada += "-";
    }

    while (intentos > 0) {
      System.out.println("Palabra secreta: " + palabraSecreta);
      System.out.println("Tu palabra: " + palabraGuiada);

      String palabra = leerPalabra();
      actualizarPalabraIntentada(palabra);

      if (palabraGuiada.equals(palabraSecreta)) {
        System.out.println("¡Enhorabuena! Has ganado.");
        return;
      }
    }

    System.out.println("Has perdido.");
  }

  private String leerPalabra() {
    System.out.println("Introduce una palabra de 5 letras:");
    String palabra = in.nextLine();

    if (palabra.length() != 5) {
      System.out.println("La palabra debe tener 5 letras.");
      return leerPalabra();
    }

    return palabra;
  }

  private void actualizarPalabraIntentada(String palabra) {
    for (int i = 0; i < palabra.length(); i++) {
      char letra = palabra.charAt(i);

      if (palabraSecreta.charAt(i) == letra) {
        palabraGuiada = palabraGuiada.substring(0, i) + letra + palabraGuiada.substring(i + 1);
      } else {
        if (palabraSecreta.contains(String.valueOf(letra))) {
          palabraGuiada = palabraGuiada.substring(0, i) + "*" + palabraGuiada.substring(i + 1);
        }
      }
    }
  }
}
