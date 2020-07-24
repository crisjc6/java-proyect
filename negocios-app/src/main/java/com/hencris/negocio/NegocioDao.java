package com.hencris.negocio;

import java.util.List;
 

 
public interface NegocioDao {	
	public NegocioEntity registrar(NegocioEntity negocio);
	public List<NegocioEntity> listar();
	public NegocioEntity actualizar(String ruc, String nombre, String direccion);
	public boolean eliminar(String negocio);
	public boolean obtenerUno(String ruc);
}