public class Main {

  public static void main(String[] args) {
    hello("Java");
    plus(2, 3);
  }

  private static void hello(String name) {
    System.out.println("Hello, " + name + "!");
  }

  private static void plus(int x, int y) {
    int result = x + y;
    System.out.printf("%d + %d = %d\r\n", x, y, result);
  }

}
