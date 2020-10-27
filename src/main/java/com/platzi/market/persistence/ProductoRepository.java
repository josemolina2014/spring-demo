package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepositoryRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepositoryRepository.findAll();
    }
    public List<Producto> getByCategoria(int idCategoria)
    {
        return productoCrudRepositoryRepository.findByIdCategoriaOrderByNombre(idCategoria);
    }
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepositoryRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepositoryRepository.findById(idProducto);
    }

    public Producto save (Producto producto){
        return productoCrudRepositoryRepository.save(producto);
    }

    public void delete (int idProducto){
        productoCrudRepositoryRepository.deleteById(idProducto);
    }

}
