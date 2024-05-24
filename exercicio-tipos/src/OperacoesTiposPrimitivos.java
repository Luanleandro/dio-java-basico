public class OperacoesTiposPrimitivos {
  public static void main(String[] args) {
      int a = 5;
      int b = 2;

      // Operações aritméticas
      System.out.println("Soma: " + (a + b));
      System.out.println("Subtração: " + (a - b));
      System.out.println("Multiplicação: " + (a * b));
      System.out.println("Divisão: " + (a / b));
      System.out.println("Resto da divisão: " + (a % b));

      // Operações de incremento e decremento
      a++;
      b--;
      System.out.println("Incremento de 'a': " + a);
      System.out.println("Decremento de 'b': " + b);

      // Operações de atribuição
      int c = a + b;
      System.out.println("Atribuição: " + c);

      // Operadores relacionais
      System.out.println("a é maior que b? " + (a > b));
      System.out.println("a é igual a b? " + (a == b));

      // Operadores lógicos
      boolean x = true;
      boolean y = false;
      System.out.println("x E y: " + (x && y));
      System.out.println("x OU y: " + (x || y));
      System.out.println("NÃO x: " + (!x));
  }
}