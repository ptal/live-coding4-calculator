package live.coding2;

public class Pow implements Expression {
  private Expression b;
  private Expression e;
  public Pow(Expression b, Expression e) {
    this.b = b;
    this.e = e;
  }

  public int evaluate() {
    return (int)Math.pow(b.evaluate(), e.evaluate());
  }

  public String toString() {
    return "(" + b + " ** " + e + ")";
  }
}
