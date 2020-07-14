package com.mycompany.app;
public class Calculadora {
     public static Double calcular(final double numberOne, final String operation, final double numberTwo)
  {
      Double Result = null;
       if (!operation.matches("[\\*//*+-]?"))
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
                    if(numberTwo == 0.0)
                        throw new ArithmeticException("No se puede dividir para (0).");
                    Result = numberOne / numberTwo;
                        
                    break;
                case "*":
                    Result = numberOne * numberTwo;
                    break;
            }
        }
        return String.valueOf(Result).matches("-0.0") ? 0 : Result;
  }
  public static Double raizPotenciaCuadrada(final double numberOne, final String operation)
  {
      Double Result = null;
            switch (operation) {
                case "potencia":
                    Result = Math.pow(numberOne,2);
                    break;
                case "raiz":
                    Result = Math.sqrt(numberOne);
                    break;
                default:
                    return null;    
            }
        return String.valueOf(Result).matches("(.*)0.0") ? 0 : Result;
  }
}