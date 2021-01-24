package main;

//@MyAnnotation  Doesn't work here!
public class Example1 {

  @MyAnnotation(xyz = ":|")
  private String x;

  @MyAnnotation(value = "this is the value", xyz = "bla bla")
  void m() {

  }
}
