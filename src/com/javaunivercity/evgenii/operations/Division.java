package com.javaunivercity.evgenii.operations;

public class Division implements BinaryOperation {
    @Override
    public int calculate(int first, int right) {
        return first / right;
    }
}
