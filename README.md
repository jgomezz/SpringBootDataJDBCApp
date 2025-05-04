## Proyecto Spring Boot con Spring Data JDBC


### Migración

#### 1.- Relacionar las clases de los entities con las tablas
```
@Table("categorias")
public class Categoria {

    @Id
    private Long id;
    @Column("nombre")
    private String nombre;
    @Column("orden")
    private Integer orden;

}
```


#### 2.- En la capa de repositorio extender las interfases de CrudRepository y se paramétriza 

```
public interface CategoriaRepository extends CrudRepository<Categoria,Long> {

    List<Categoria> findAll() ;

}

public interface ProductoRepository extends CrudRepository<Producto,Long> {

     List<Producto> findAll() ;

     List<Producto> findByNombre(String nombre) ;

     @Modifying
     @Query("UPDATE productos SET nombre = :nombreProducto WHERE id = :id ")
     void update(@Param("id") Long id, @Param("nombreProducto") String nombreProducto);
     
}
```

#### 3.- Eliminar las implementaciones de la capa de repositorio
