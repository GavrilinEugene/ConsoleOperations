package com.javaunivercity.evgenii.operations;

public class Subtraction implements BinaryOperation {

    @Override
    public int calculate(int left, int right) {
        return left - right;
    }
}
