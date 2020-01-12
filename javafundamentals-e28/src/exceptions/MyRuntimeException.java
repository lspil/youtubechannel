package exceptions;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super("This is my runtime exception!");
    }
}
