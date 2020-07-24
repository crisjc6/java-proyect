package com.hencris.app;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

import com.hencris.negocio.NegocioEntity;
import com.hencris.negocio.NegocioService;

public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello world");
        boolean salir = false;
        NegocioService negocioService = new NegocioService();
    while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println(" INGRESE LA OPCION ");
            System.out.println(" 1 - crear negocios ");
            System.out.println(" 2 - Listar negocios ingresados");
            System.out.println(" 3 - Eliminar negocio ");
            System.out.println(" 4 - Modificar negocio ");
            System.out.println(" 0 - Salir ");
            
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = 0;
            try {
                opcion = Integer.parseInt(entrada.nextLine());
            } catch (Exception e) {
                System.out.println("Error: Exception no se puede guardar el valor ingresado " + e );
                salir = true;
                //TODO: handle exception
            }
           
            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch(opcion) {
                case 1: // "case" Ingresar nuevo negocio
                    // Instanciamos un negocio vacio (Sin atributos)
                    NegocioEntity a = new NegocioEntity();
                    System.out.println("Ingrese nombre del negocio:");
                    // Obtenemos la nombre que el usuario escribió y la guardamos en el negocio.
                    a.setNombre(entrada.nextLine());
                    System.out.println("Ingrese ruc del negocio: ");
                    // De la misma forma, guardamos el ruc
                    a.setRuc(entrada.nextLine());
                    System.out.println("Ingrese la razon social: ");
                    // guardamos la razon social que el usuario ingresó
                    a.setRazonSocial(entrada.nextLine());
                    System.out.println("Ingrese la dirección");
                    // Y guardamos la direccion
                    a.setDireccion(entrada.nextLine());
                    // Mandamos a almacenar a nuestro servicio lista
                    negocioService.registrar(a);                    
                    break;
                case 2: // Listar todos los negocios ingresados en la lista
                    negocioService.listar(); 
                    break;
                case 3: // ELiminar Negocio de la lista
                    System.out.println("Ingreser la ruc del negocio a eliminar: ");
                    String ruc = entrada.nextLine();
                    boolean eliminado = negocioService.eliminar(ruc);
                    if(eliminado) {
                        System.out.println("------------------------------------------");
                        System.out.println("Negocio eliminado");
                        System.out.println("------------------------------------------");
                    }else {
                        System.out.println("------------------------------------------");
                        System.out.println("Negocio no registrado ");
                        System.out.println("------------------------------------------");
                    }
                    break;
                case 4: // Modificar Negocio:
                    System.out.println(" Ingrese el ruc del negocio a modificar");
                    ruc = entrada.nextLine();
                    boolean existe = negocioService.obtenerUno(ruc);
                    if(existe) {
                        System.out.println("Ingrese nuevo nombre: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese nueva direccion: ");
                        String direccion = entrada.nextLine();;
                        negocioService.actualizar(ruc, nombre, direccion);
                    }else {
                        System.out.println("------------------------------------------");
                        System.out.println("Negocio no registrado ");
                        System.out.println("------------------------------------------");
                    }
                    break;
                case 0:// "case" Salir del programa
                    salir = true;
                    System.out.println("------------------------------------------");
                    System.out.println("Saliendo del programa");
                    System.out.println("------------------------------------------");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opcion invalida!!!!!!!");
                
            }
        }
    }
}
