public class ManipulacaoCaracteres {
  public static void main(String[] args) {
      char letra = 'A';
      System.out.println("Letra: " + letra);

      // Conversão de caractere para inteiro
      int valorAscii = (int) letra;
      System.out.println("Valor ASCII: " + valorAscii);

      // Operações com caracteres
      char proximaLetra = (char) (letra + 1);
      System.out.println("Próxima letra: " + proximaLetra);
  }
}