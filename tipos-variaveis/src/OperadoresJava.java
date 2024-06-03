public class OperadoresJava {
  public static void main(String[] args) {
    String nomeDois = "LUAN";
    String nomeUm = new String("LUAN");

    System.out.println(nomeUm.equals(nomeDois));
  

    int numero1 = 5;
    int numero2 = 7;

    if (numero1 == numero2) {
      System.out.println("a nossa condição é verdadeira");
    }

    if (numero1 < numero2) {
      System.out.println("numeroUm é menor que numeroDois");
    }
  }
}
