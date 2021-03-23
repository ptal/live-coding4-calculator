package live.coding;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("Welcome to my Calculator app!");
    // 7**(3+7)
    Expression e = new Pow(
      new Constant(7),
      new Addition(new Constant(3), new Constant(7)));
    print(e);
    System.out.println(" = " + evaluate(e));
  }

  public static int evaluate(Expression e) {
    if(e instanceof Constant) {
      Constant c = (Constant)e;
      return c.value();
    }
    else if(e instanceof Addition) {
      Addition a = (Addition) e;
      return evaluate(a.left()) + evaluate(a.right());
    }
    else if(e instanceof Pow) {
      Pow p = (Pow) e;
      return (int)Math.pow(evaluate(p.base()), evaluate(p.exponent()));
    }
    assert(false);
    return -1;
  }

  public static void print(Expression e) {
    if(e instanceof Constant) {
      Constant c = (Constant)e;
      System.out.print(c.value());
    }
    else if(e instanceof Addition) {
      Addition a = (Addition) e;
      System.out.print("(");
      print(a.left());
      System.out.print(" + ");
      print(a.right());
      System.out.print(")");
    }
    else if(e instanceof Pow) {
      Pow p = (Pow) e;
      System.out.print("(");
      print(p.base());
      System.out.print(" ** ");
      print(p.exponent());
      System.out.print(")");
    }
    assert(false);
  }
}
