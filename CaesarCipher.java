import java.util.Scanner;

public class CaesarCipher {

  public static String encrypt(String mensaje) {
      StringBuilder mensajeCifrado = new StringBuilder();

      char[] caracteres = mensaje.toUpperCase().toCharArray();
      for (int i = 0; i < caracteres.length; i++) {
          char caracter = caracteres[i];
          if (Character.isLetter(caracter)) {
              if (caracter == 'Z') {
                  mensajeCifrado.append('A');
              } else {
                  mensajeCifrado.append((char) (caracter + 1));
              }
          } else if (Character.isDigit(caracter)) {
              if (caracter == '9') {
                  mensajeCifrado.append('0');
              } else {
                  mensajeCifrado.append((char) (caracter + 1));
              }
          } else {
              mensajeCifrado.append(caracter);
          }
      }

      return mensajeCifrado.toString();
  }

  public static String decrypt(String mensajeCifrado) {
      StringBuilder mensajeDescifrado = new StringBuilder();

      char[] caracteres = mensajeCifrado.toUpperCase().toCharArray();
      for (int i = 0; i < caracteres.length; i++) {
          char caracter = caracteres[i];
          if (Character.isLetter(caracter)) {
              if (caracter == 'A') {
                  mensajeDescifrado.append('Z');
              } else {
                  mensajeDescifrado.append((char) (caracter - 1));
              }
          } else if (Character.isDigit(caracter)) {
              if (caracter == '0') {
                  mensajeDescifrado.append('9');
              } else {
                  mensajeDescifrado.append((char) (caracter - 1));
              }
          } else {
              mensajeDescifrado.append(caracter);
          }
      }

      return mensajeDescifrado.toString();
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String mensajeOriginal = in.nextLine();
      String mensajeCifrado = encrypt(mensajeOriginal);
      System.out.println("Mensaje cifrado: " + mensajeCifrado);

      String mensajeDescifrado = decrypt(mensajeCifrado);
      System.out.println("Mensaje descifrado: " + mensajeDescifrado);
  }
}
