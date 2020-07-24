package com.hencris.negocio;

public class NegocioEntity {

    private String nombre;
    private String ruc;
    private String razonSocial;
    private String direccion;

    public NegocioEntity(){

    }

    public NegocioEntity(final String nombre, final String ruc, final String razonSocial, final String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(final String ruc) {
        this.ruc = ruc;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(final String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(final String direccion) {
        this.direccion = direccion;
    }
    
}