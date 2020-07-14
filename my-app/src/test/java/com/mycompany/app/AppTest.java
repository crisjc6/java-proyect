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
    public void sumaTest()
    {
       Assert.assertEquals("3.2 + 8 = 11.2",new Double(11.2),Calculadora.calcular(3.2,"+", 8));
       Assert.assertEquals("-100 + 50 = -50",new Double(-50),Calculadora.calcular(-100,"+", 50));
    }
    @Test
    public void restaTest()
    {
      Assert.assertEquals("3.2 - 8 = -4.8",new Double(-4.8),Calculadora.calcular(3.2,"-", 8));
      Assert.assertEquals("-3 - 0 = -3",new Double(-3),Calculadora.calcular(-3,"-", 0));

    }
    @Test
    public void multiTest()
    {
      Assert.assertEquals("3.2 * 8 = 25.6",new Double(25.6),Calculadora.calcular(3.2,"*", 8));
      Assert.assertEquals("-3 * 0 = 0",new Double(0),Calculadora.calcular(-3,"*", 0));

    }
    @Test 
    public void divTest()
    {
      Assert.assertEquals("3.2 / 8 = .4",new Double(0.4),Calculadora.calcular(3.2,"/", 8));
      Assert.assertEquals("-2 / -2 = 1",new Double(1),Calculadora.calcular(-2, "/", -2));
    }
    @Test
    public void testBasico() 
    {
      Assert.assertEquals("-3 w 0 = null",null,Calculadora.calcular(-3,"w", 0));
      Assert.assertEquals("2 potencia 2 = 4",new Double(4.0),Calculadora.raizPotenciaCuadrada(2,"potencia"));
      Assert.assertEquals("64 raiz 2 = 8",new Double(8.0),Calculadora.raizPotenciaCuadrada(64,"raiz"));
      Assert.assertEquals("2 w 2 = 4",null,Calculadora.raizPotenciaCuadrada(2,"w"));
    }

    @Test(expected = ArithmeticException.class)
    public void divicionExcepcion() { 
          double actual = Calculadora.calcular(2,"/",0.0);
    } 
}
