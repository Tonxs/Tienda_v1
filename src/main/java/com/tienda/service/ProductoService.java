package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;
public interface ProductoService {
    
    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos (boolean activos);
    
    //Se obtiene una producto por medio de su id
    public Producto getProducto(Producto producto);
    
    //Metodo salvar
    public void save (Producto producto);
    
    //Metodo eliminar
    public void delete (Producto producto);
    
}
