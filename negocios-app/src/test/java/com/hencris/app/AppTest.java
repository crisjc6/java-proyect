package com.hencris.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.hencris.negocio.NegocioEntity;
import com.hencris.negocio.NegocioService;

import org.junit.Test;


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
    public void EliminarNegociosTest()
    {
        assertTrue( true );
    }
    @Test
    public void ListarNegociosTest()
    {
        assertTrue( true );
    }
    @Test
    public void obtenerUnoNegociosTest()
    {
        assertTrue( true );
    }
    
}
