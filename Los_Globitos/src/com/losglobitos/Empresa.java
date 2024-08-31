package com.losglobitos;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Factura> facturas;
    private ArrayList<Logistica> logistica;
    private ArrayList<Categoria> categorias;

    public Empresa(String nombre) {
        this.setNombre(nombre);
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.logistica = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    // Métodos para Productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void modificarProducto(String codigo, String nuevoNombre, int nuevaCantidad) {
        Producto producto = buscarProductoPorCodigo(codigo);
        if (producto != null) {
            producto.setNombre(nuevoNombre);
            producto.setCantidad(nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }


    // Métodos para Clientes
public void agregarCliente(Cliente cliente) {
    clientes.add(cliente);
}

public void mostrarClientes() {
    for (Cliente cliente : clientes) {
        System.out.println(cliente);
    }
}

public Cliente buscarClientePorCodigo(String codigo) {
    for (Cliente cliente : clientes) {
        if (cliente.getCodigo().equals(codigo)) {
            return cliente;
        }
    }
    return null;
}

public void modificarCliente(String codigo, String nuevoNombre) {
    Cliente cliente = buscarClientePorCodigo(codigo);
    if (cliente != null) {
        cliente.setNombre(nuevoNombre);
    } else {
        System.out.println("Cliente no encontrado.");
    }
}

    // Métodos para Vendedores
    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void mostrarVendedores() {
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }

    public Vendedor buscarVendedorPorCodigo(String codigo) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCodigo().equals(codigo)) {
                return vendedor;
            }
        }
        return null;
    }

    public void modificarVendedor(String codigo, String nuevoNombre) {
        Vendedor vendedor = buscarVendedorPorCodigo(codigo);
        if (vendedor != null) {
            vendedor.setNombre(nuevoNombre);
        } else {
            System.out.println("Vendedor no encontrado.");
        }
    }

    // Métodos para Proveedores
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void mostrarProveedores() {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }

    public Proveedor buscarProveedorPorNombre(String nombre) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getNombre().equals(nombre)) {
                return proveedor;
            }
        }
        return null;
    }

    public void modificarProveedor(String nombre, String nuevoNombreEmpresa, String nuevoProducto) {
        Proveedor proveedor = buscarProveedorPorNombre(nombre);
        if (proveedor != null) {
            proveedor.setNombreEmpresa(nuevoNombreEmpresa);
            proveedor.setProducto(nuevoProducto);
        } else {
            System.out.println("Proveedor no encontrado.");
        }
    }

    // Métodos para Facturas
    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public void mostrarFacturas() {
        for (Factura factura : facturas) {
            System.out.println(factura);
        }
    }

    public Factura buscarFacturaPorId(String id) {
        for (Factura factura : facturas) {
            if (factura.getId().equals(id)) {
                return factura;
            }
        }
        return null;
    }

    public void modificarFactura(String id, String nuevoEstado) {
        Factura factura = buscarFacturaPorId(id);
        if (factura != null) {
            factura.setEstado(nuevoEstado);
        } else {
            System.out.println("Factura no encontrada.");
        }
    }
 // Métodos para Logística
    public void agregarLogistica(Logistica logistica) {
        this.logistica.add(logistica);
    }

    public void mostrarLogistica() {
        for (Logistica item : logistica) {
            System.out.println(item);
        }
    }

    public Logistica buscarLogisticaPorId(String id) {
        for (Logistica item : logistica) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void modificarLogistica(String id, String nuevoEstado) {
        Logistica item = buscarLogisticaPorId(id);
        if (item != null) {
            item.setEstado(nuevoEstado);
        } else {
            System.out.println("Logística no encontrada.");
        }
    }

 // Métodos para Categorías
    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void mostrarCategorias() {
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        for (Categoria categoria : categorias) {
            if (categoria.getNombre().equals(nombre)) {
                return categoria;
            }
        }
        return null;
    }

    public void modificarCategoria(String nombre, String nuevoNombre) {
        Categoria categoria = buscarCategoriaPorNombre(nombre);
        if (categoria != null) {
            categoria.setNombre(nuevoNombre);
        } else {
            System.out.println("Categoría no encontrada.");
        }
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<Logistica> getLogistica() {
		return logistica;
	}

	public void setLogistica(ArrayList<Logistica> logistica) {
		this.logistica = logistica;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
}
    
