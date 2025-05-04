package pe.edu.tecsup.springbootapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {

    List<Categoria> findAll() ;
}
