## Proyecto Spring Boot con Spring Data JDBC


### Migración

#### 1.- Relacionar las clases de los entities con las tablas
'''
@Table
@Id
@Column
'''

#### 2.- En la capa de repositorio extender las interfases de CrudRepositorio 
#### 3.- Eliminar las implementaciones de la capa de de repositorio
