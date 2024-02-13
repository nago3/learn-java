import modules.Calculator;
import modules.Hello;


public class Main {

  public static void main(String[] args) {
    System.out.println(Hello.hello("Java"));

    int x = 2;
    int y = 3;
    System.out.printf("%d + %d = %d\r\n", x, y, Calculator.plus(x, y));
    System.out.printf("%d + %d = %d\r\n", x, y, Calculator.minus(x, y));
  }

}
