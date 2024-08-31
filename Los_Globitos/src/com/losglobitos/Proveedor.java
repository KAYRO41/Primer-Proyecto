package com.losglobitos;

public class Proveedor {
    private String nombre;
    private String nombreEmpresa;
    private String producto;

    public Proveedor(String nombre, String nombreEmpresa, String producto) {
        this.nombre = nombre;
        this.nombreEmpresa = nombreEmpresa;
        this.producto = producto;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

}
