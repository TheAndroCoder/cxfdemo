package com.cxf.soap.ws;

public class OperationsImpl implements Operations{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
