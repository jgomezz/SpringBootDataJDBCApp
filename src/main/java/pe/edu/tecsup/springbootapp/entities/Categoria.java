package pe.edu.tecsup.springbootapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Table("categorias")
public class Categoria {

    @Id
    private Long id;
    @Column("nombre")
    private String nombre;
    @Column("orden")
    private Integer orden;

}
