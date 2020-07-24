package com.hencris.negocio;

import java.util.ArrayList;
import java.util.List;

public class NegocioService implements NegocioDao {

    ArrayList<NegocioEntity> listaNegocios = new ArrayList<>();

    @Override
    public NegocioEntity registrar(NegocioEntity negocio) {
        // TODO Auto-generated method stub
        listaNegocios.add(negocio);
        int index = listaNegocios.indexOf(negocio); 
        System.out.println("------------------------------------------");     
        System.out.println("NEGOCIO CREADO: ");
        System.out.println("Nombre: " + negocio.getNombre());
        System.out.println("Ruc: " + negocio.getRuc());
        System.out.println("Razon Social: " + negocio.getRazonSocial());
        System.out.println("Dirección: " + negocio.getDireccion());
        System.out.println("------------------------------------------");
        return listaNegocios.get(index);
    }

    @Override
    public NegocioEntity actualizar(String ruc, String nombre, String direccion) {
        // TODO Auto-generated method stub
        NegocioEntity negocio = new NegocioEntity(); 
        for (int i = 0; i < listaNegocios.size(); i++) {
            negocio = listaNegocios.get(i);
            if (ruc.equals(negocio.getRuc())) {
                
                negocio.setDireccion(direccion);
                negocio.setNombre(nombre);
                System.out.println("------------------------------------------");
                System.out.println("NEGOCIO ACTUALIZADO: ");
                System.out.println("Nombre: " + negocio.getNombre());
                System.out.println("Ruc: " + negocio.getRuc());
                System.out.println("Razon Social: " + negocio.getRazonSocial());
                System.out.println("Dirección: " + negocio.getDireccion());
                System.out.println("------------------------------------------");
            }
        }
        return negocio;
    }
    @Override
    public List<NegocioEntity> listar() {

        // TODO Auto-generated method stub

        for(int i = 0; i < listaNegocios.size(); i++){ 
            System.out.println("------------------------------------------");
            System.out.println("Negocio: " + (i + 1));
            // Para obtener un elemento de la lista, utilizamos .get():
            NegocioEntity negocio =  listaNegocios.get(i); 
            
            System.out.println("Nombre: " + negocio.getNombre());
            System.out.println("Ruc: " + negocio.getRuc());
            System.out.println("Razon Social: " + negocio.getRazonSocial());
            System.out.println("Direccion: " + negocio.getDireccion());
            System.out.println("------------------------------------------");
        }
        return listaNegocios;
    }
    @Override
    public boolean eliminar(String ruc) {
    // TODO Auto-generated method stub
        boolean respuesta = false;
        for (int i = 0; i < listaNegocios.size(); i++) {
            NegocioEntity negocio = listaNegocios.get(i);
        // buscamos cual de los ruc en la lista coincide con lo que el usuario escribió:
            if (ruc.equals(negocio.getRuc())) {
            // Eliminamos un elemento de la lista utilizando .remove()
            listaNegocios.remove(i);
            respuesta = true;
            }
            else {
                respuesta = false;
            }
        }
        return respuesta;
    }  

    @Override
    public boolean obtenerUno(String ruc) {
        boolean respuesta = false;
        for (int i = 0; i < listaNegocios.size(); i++) {
            NegocioEntity negocio =  listaNegocios.get(i); 
            if (ruc.equals(negocio.getRuc())) {
                respuesta = true;

            } else {
                respuesta = false;
            }
        
    }
    return respuesta;
}
}