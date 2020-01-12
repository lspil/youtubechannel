package main;

import exceptions.MyRuntimeException;
import exceptions.TooMuchMoneyException;

public interface I1 {

    void m() throws MyRuntimeException;
    // sometimes you throw runtime exception for document purposes
}
