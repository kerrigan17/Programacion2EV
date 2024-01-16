import java.util.Scanner;

class HangmanGame {

  private String palabraSecreta;
  private String palabraGuiada;
  private int intentos;
  static Scanner in = new Scanner(System.in);

  public HangmanGame() {
      this.palabraSecreta = "";
      this.palabraGuiada = "";
      this.intentos = 6;
  }

  public void jugar() {
      this.palabraSecreta = leerPalabra();
      for (int i = 0; i < this.palabraSecreta.length(); i++) {
          this.palabraGuiada += "-";
      }
      while (this.intentos > 0) {
          System.out.println(this.palabraGuiada);

          char letra = leerLetra(in);

          int coincidencias = 0;
          for (int i = 0; i < this.palabraSecreta.length(); i++) {
              if (this.palabraSecreta.charAt(i) == letra) {
                  this.palabraGuiada = this.palabraGuiada.substring(0, i) + letra + this.palabraGuiada.substring(i + 1);
                  coincidencias++;
              }
          }

          if (coincidencias == 0) {
              this.intentos--;
          }

          if (this.palabraGuiada.equals(this.palabraSecreta)) {
              System.out.println("¡Enhorabuena! Has ganado.");
              break;
          }

          if (this.intentos == 5) {
              System.out.println("      o");
          }
          if (this.intentos == 4) {
            System.out.println("      o");
            System.out.println("      |");
          }
          if (this.intentos == 3) {
            System.out.println("      o");
            System.out.println("     /|");
          }
          if (this.intentos == 2) {
            System.out.println("      o");
            System.out.println("     /|\\");
          }
          if (this.intentos == 1) {
            System.out.println("      o");
            System.out.println("     /|\\");
          }


          if (this.intentos == 0) {
              System.out.println("Has perdido.");
              System.out.println("");
              System.out.println("     o");
              System.out.println("    /|\\");
              System.out.println("    / \\");
          }
      }
      in.close();
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

  private char leerLetra(Scanner in) {
      System.out.println("Introduce una letra:");
      char letra = in.next().charAt(0);

      if (!Character.isLetter(letra)) {
          System.out.println("La letra debe ser una letra.");
          return leerLetra(in);
      }

      return letra;
  }

  public static void main(String[] args) {

    HangmanGame juego = new HangmanGame();

    juego.jugar();
}
}
