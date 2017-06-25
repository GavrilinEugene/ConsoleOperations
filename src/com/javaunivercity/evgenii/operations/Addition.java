package com.javaunivercity.evgenii.operations;

public class Addition implements BinaryOperation {
    @Override
    public int calculate(int left, int right) {
        return left + right;
    }
}
