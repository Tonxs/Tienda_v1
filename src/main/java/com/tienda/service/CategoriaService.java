package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
public interface CategoriaService {
    
    //Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias (boolean activos);
    
    //Se obtiene una categoria por medio de su id
    public Categoria getCategoria(Categoria categoria);
    
    //Metodo salvar
    public void save (Categoria categoria);
    
    //Metodo eliminar
    public void delete (Categoria categoria);
    
}
