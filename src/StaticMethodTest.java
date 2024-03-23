public class StaticMethodTest {
  public static void main(String[] args) {
    System.out.println("Hello Main");
    sub1();
    sub2();
  }
  public static void sub1() {
    System.out.println("Hello Sub");
  }
  public static void sub2() {
    int[] area = initVar();
    System.out.println("Area: " + Integer.toString(area[0] * area[1]));
  }
  private static int[] initVar() {
    int height = 2;
    int length = 2;

    return new int[]{height, length};
  }
}
