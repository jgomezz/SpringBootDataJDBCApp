package pe.edu.tecsup.springbootapp.repositories;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends CrudRepository<Producto,Long> {

     List<Producto> findAll() ;

     List<Producto> findByNombre(String nombre) ;

     @Modifying
     @Query("UPDATE productos SET nombre = :nombreProducto WHERE id = :id ")
     void update(@Param("id") Long id, @Param("nombreProducto") String nombreProducto);

}
