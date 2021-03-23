package live.coding2;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("Welcome to my Calculator app!");
    // 7**(3+7)
    Expression e = new Pow(
      new Constant(7),
      new Subtraction(new Constant(7), new Constant(3)));
    System.out.println(e + " = " + e.evaluate());
  }
}
