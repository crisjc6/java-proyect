package com.hencris.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.hencris.negocio.NegocioEntity;
import com.hencris.negocio.NegocioService;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    NegocioService negocioService = new NegocioService();
    NegocioEntity negocio = new NegocioEntity();
    @Test
    public void registrarNegociosTest()
    {
        negocio.setDireccion("Av. Naciones Unidadas");
        negocio.setNombre("Peluqueria");
        negocio.setRazonSocial("Enrique Perez");
        negocio.setRuc("1104125883");
        final NegocioEntity expected = negocioService.registrar(negocio); 
        final NegocioEntity actual =  negocio;
        assertEquals(expected.getNombre(),actual.getNombre());
        assertEquals(expected.getRuc(),actual.getRuc());
        assertEquals(expected.getRazonSocial(),actual.getRazonSocial());
        assertEquals(expected.getDireccion(),actual.getDireccion());
    }
    @Test
    public void actualizarNegociosTest()
    {
        negocio.setDireccion("Av. Naciones Unidadas");
        negocio.setNombre("Peluqueria");
        negocio.setRazonSocial("Enrique Perez");
        negocio.setRuc("1104125883");
        final String nombreActualizar = "Centro de Belleza";
        final String direccionActualizar = "Av. Republica";
        final NegocioEntity actual = negocioService.registrar(negocio);
        final NegocioEntity expected = negocioService.actualizar(negocio.getRuc(), nombreActualizar, direccionActualizar);
        assertEquals(expected.getRuc(),actual.getRuc());
        assertEquals(expected.getRazonSocial(),actual.getRazonSocial());
        assertEquals(expected.getDireccion(),direccionActualizar);
        assertEquals(expected.getNombre(),nombreActualizar);
    }
    @Test
    public void ListarNegociosTest()
    {
        negocio.setDireccion("Av. Naciones Unidadas");
        negocio.setNombre("Peluqueria");
        negocio.setRazonSocial("Enrique Perez");
        negocio.setRuc("1104125883");
        final NegocioEntity actual = negocioService.registrar(negocio);
        final  List<NegocioEntity> expected = negocioService.listar();
        assertEquals(expected.get(0),actual);
    }
    @Test
    public void obtenerUnoNegociosTest()
    {
        negocio.setDireccion("Av. Naciones Unidadas");
        negocio.setNombre("Peluqueria");
        negocio.setRazonSocial("Enrique Perez");
        negocio.setRuc("1104125883");
        final NegocioEntity negocioCreado = negocioService.registrar(negocio);
        final  boolean expected = negocioService.obtenerUno("1104125883");
        assertEquals(expected,true);
    }
    @Test
    public void EliminarNegociosTest()
    {
        negocio.setDireccion("Av. Naciones Unidadas");
        negocio.setNombre("Peluqueria");
        negocio.setRazonSocial("Enrique Perez");
        negocio.setRuc("1104125883");
        final NegocioEntity negocioCreado = negocioService.registrar(negocio);
        final  boolean expected = negocioService.eliminar("1104125883");
        assertEquals(expected,true);
    }
    
}
