package live.coding;

public class Pow implements Expression {
  private Expression b;
  private Expression e;
  public Pow(Expression b, Expression e) {
    this.b = b;
    this.e = e;
  }

  public Expression base() {
    return b;
  }
  public Expression exponent() {
    return e;
  }
}
