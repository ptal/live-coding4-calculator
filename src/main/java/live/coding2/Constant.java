package live.coding2;

public class Constant implements Expression {
  private int v;

  public Constant(int v) {
    this.v = v;
  }

  public int evaluate() {
    return v;
  }

  public String toString() {
    return v + "";
  }
}
