package com.losglobitos;

public class Venta {
    private Producto producto;
    private Cliente cliente;
    private int cantidadVendida;

    public Venta(Producto producto, Cliente cliente, int cantidadVendida) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidadVendida = cantidadVendida;
    }

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

    // Métodos relevantes para gestionar ventas
}
