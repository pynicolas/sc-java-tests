public class RedundantParentheses {
  public Object foo(Object p1) {
    if ((p1 != null)) {
      return p1;
    }
    return null;
  }

  public Object bar(Object p1) {
    if (((p1 != null))) {
      return p1;
    }
    return null;
  }
}
