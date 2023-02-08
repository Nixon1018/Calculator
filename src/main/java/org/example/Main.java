package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class   calculator
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
class Methods extends calculator
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

public class Main {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l=1;
        calculator c = new Methods();

        do
        {
            logger.info("Enter the value:");
            int value= sc.nextInt();
            c.setValue(value);
            int n=1;
            do
            {
                logger.info("1.add 2.subract 3.multiply 4.divide 5.exit");
                int v=sc.nextInt();
                if(v==1)
                {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculateadd(a);
                    String z="Result:"+c.getvalue();
                    logger.info(z);
                }
                else if(v==2)
                {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculatesub(a);
                    String z="Result:"+c.getvalue();
                    logger.info(z);
                }
                else if(v==3)
                {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculatemul(a);
                    String z="Result:"+c.getvalue();
                    logger.info(z);
                }
                else if(v==4)
                {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculatediv(a);
                    String z="Result:"+c.getvalue();
                    logger.info(z);
                }
                else if(v==5)
                {
                    l=0;
                    n=0;
                }
            }while(n==1);
        } while(l==1);


    }
}