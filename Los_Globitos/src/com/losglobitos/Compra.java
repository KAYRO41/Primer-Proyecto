package com.losglobitos;

public class Compra {
    private Producto producto;
    private Proveedor proveedor;
    private int cantidadComprada;

    public Compra(Producto producto, Proveedor proveedor, int cantidadComprada) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.cantidadComprada = cantidadComprada;
    }

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}

    // Métodos relevantes para gestionar compras
}
