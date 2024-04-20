public class APLine {
  int a, b, c;

  public APLine(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getSlope() {
    return -a / b;
  }

  public boolean isOnLine(double x, double y) {
    return (this.a * x + this.b * y + c) == 0;
  }
}