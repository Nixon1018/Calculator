package org.example;

public abstract class   Calculator
{
    abstract void calculateadd (int a);
    abstract void calculatesub (int a);
    abstract void calculatemul (int a);
    abstract void calculatediv (int a);
    private int value;
    int getvalue()
    {
        return this.value;
    }
    void setValue(int value)
    {
        this.value=value;
    }
}
