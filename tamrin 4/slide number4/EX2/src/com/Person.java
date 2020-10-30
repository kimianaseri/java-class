package com;

public class Person <NAME,PASSWORD>{
    public NAME name;
    public PASSWORD password;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
