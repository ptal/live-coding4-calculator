package live.coding;

public class Constant implements Expression {
  private int v;
  public Constant(int v) {
    this.v = v;
  }
  public int value() {
    return v;
  }
}
