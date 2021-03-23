package live.coding;

public class Addition implements Expression {
  private Expression l;
  private Expression r;
  public Addition(Expression l, Expression r) {
    this.l = l;
    this.r = r;
  }
  public Expression left() {
    return l;
  }
  public Expression right() {
    return r;
  }
}
