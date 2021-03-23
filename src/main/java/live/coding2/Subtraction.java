package live.coding2;

public class Subtraction implements Expression {
  private Expression l;
  private Expression r;
  public Subtraction(Expression l, Expression r) {
    this.l = l;
    this.r = r;
  }

  public int evaluate() {
    return l.evaluate() - r.evaluate();
  }

  public String toString() {
    return "(" + l + " - " + r + ")";
  }
}
