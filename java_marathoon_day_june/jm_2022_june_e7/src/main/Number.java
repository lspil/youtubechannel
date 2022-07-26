package main;

public class Number {

  private volatile int value;
      // what does volatile mean here?  ->> this means all CPUs will see the changed value
      // this doesn't mean it's synchronized -> you can still face race condition issues on this variable.

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
