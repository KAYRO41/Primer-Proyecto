package com.losglobitos;

public class Importacion {
    private Producto producto;
    private String paisOrigen;
    private String detallesEnvio;

    public Importacion(Producto producto, String paisOrigen, String detallesEnvio) {
        this.producto = producto;
        this.paisOrigen = paisOrigen;
        this.detallesEnvio = detallesEnvio;
    }

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getDetallesEnvio() {
		return detallesEnvio;
	}

	public void setDetallesEnvio(String detallesEnvio) {
		this.detallesEnvio = detallesEnvio;
	}

}
