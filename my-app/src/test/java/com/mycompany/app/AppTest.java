package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
   @Test
    public void BasicTest() {
      Assert.assertEquals("3.2 + 8 = 11.2",new Double(11.2),Calculadora.calcular(3.2,"+", 8));
      Assert.assertEquals("3.2 - 8 = -4.8",new Double(-4.8),Calculadora.calcular(3.2,"-", 8));
      Assert.assertEquals("3.2 / 8 = .4",new Double(0.4),Calculadora.calcular(3.2,"/", 8));
      Assert.assertEquals("3.2 * 8 = 25.6",new Double(25.6),Calculadora.calcular(3.2,"*", 8));
      Assert.assertEquals("-3 + 0 = -3",new Double(-3),Calculadora.calcular(-3,"+", 0));
      Assert.assertEquals("-3 - 0 = -3",new Double(-3),Calculadora.calcular(-3,"-", 0));
      Assert.assertEquals("-3 / 0 = null",null,Calculadora.calcular(-3,"/", 0));
      Assert.assertEquals("-2 / -2 = 1",new Double(1),Calculadora.calcular(-2, "/", -2));
      Assert.assertEquals("-3 * 0 = 0",new Double(0),Calculadora.calcular(-3,"*", 0));
      Assert.assertEquals("-3 w 0 = null",null,Calculadora.calcular(-3,"w", 0));
      Assert.assertEquals("2 potencia 2 = 4",new Double(4.0),Calculadora.raizPotenciaCuadrada(2,"potencia"));
      Assert.assertEquals("64 raiz 2 = 8",new Double(8.0),Calculadora.raizPotenciaCuadrada(64,"raiz"));
      Assert.assertEquals("2 w 2 = 4",null,Calculadora.raizPotenciaCuadrada(2,"w"));
    }
}
/*
  public static Double calculate(final double numberOne, final String operation, final double numberTwo)
  {
      Double Result = null;
       if ((numberTwo == 0 && operation.equals("/")) || !operation.matches("[\\*//*+-]?"))
            return null;
        else {

            switch (operation) {
                case "+":
                    Result = numberOne + numberTwo;
                    break;
                case "-":
                    Result = numberOne - numberTwo;
                    break;
                case "/":
                    Result = numberOne / numberTwo;
                    break;
                case "*":
                    Result = numberOne * numberTwo;
                    break;
            }
        }
        return String.valueOf(Result).matches("(.*)0.0") ? 0 : Result;
  } */