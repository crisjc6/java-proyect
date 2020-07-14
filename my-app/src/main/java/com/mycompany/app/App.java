package com.mycompany.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner leer = new Scanner(System.in);

         Calculadora x = new Calculadora();


        System.out.println("menu calculadora" );
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        System.out.println("5) Elevar a al cuadrado");
        System.out.println("6) Raíz cuadrada");
        int opc=leer.nextInt(); 

        if(opc==1)
        {
          Scanner num1 = new Scanner(System.in);
            Scanner num2 = new Scanner(System.in);
            System.out.println("num1");
            int n1=leer.nextInt();
            System.out.println("num2");
            double n2=leer.nextInt();
            double suma= x.calcular(n1,"+",n2);
            System.out.println("el resultado es: "+ suma);
        }
        if(opc==2)
        {   System.out.println("num1");
            double n1=leer.nextInt();
            System.out.println("num2");
            double n2=leer.nextInt();
            double resta=x.calcular(n1,"-", n2);
            System.out.println("la resta es: "+ resta);
        }
         if(opc==3)
        {   System.out.println("num1");
            double n1=leer.nextInt();
            System.out.println("num2");
            double n2=leer.nextInt();
            double multipli=x.calcular(n1,"*", n2);
            System.out.println("la multiplicacion es: "+ multipli);
        }
         if(opc==4)
        {   
            System.out.println("num1");
            double n1=leer.nextInt();
            System.out.println("num2");
            double n2=leer.nextInt();
            double divi=x.calcular(n1,"/", n2);
            System.out.println("la division es: "+ divi);
        }
        if(opc==5)
        {   
            System.out.println("num1");
            double n1=leer.nextInt();
            double pow=x.raizPotenciaCuadrada(n1,"potencia");
            System.out.println("El resultado de elevación al cuadrado es: "+ pow);
        }
        if(opc==6)
        {   
            System.out.println("num1");
            double n1=leer.nextInt();
            double sqrt=x.raizPotenciaCuadrada(n1,"raiz");
            System.out.println("El resultado de raiz cuadrada es: "+ sqrt);
        }

    }
    

}
