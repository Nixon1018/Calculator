package org.example;

public class Methods extends Calculator
{
    void calculateadd(int a)
    {
        setValue(getvalue()+a);
    }
    void  calculatesub(int a)
    {
        setValue(getvalue()-a);
    }
    void calculatemul(int a)
    {
        setValue(getvalue()*a);
    }
    void calculatediv(int a)
    {
        setValue(getvalue()/a);
    }
}