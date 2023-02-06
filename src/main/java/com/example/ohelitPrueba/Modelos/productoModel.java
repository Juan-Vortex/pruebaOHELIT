package com.example.ohelitPrueba.Modelos;

import jakarta.persistence.*;

// dev_JB - agregamos @Entity para que java sepa que es un modelo de BD o un POJO
// dev_JB - creamos un alis para que se cree con este nuestra entidad en la BD  ->  @Table(name = "producto")
// dev_JB - Abajo de este alias la clase modelo con sus setter y getter para los atributos de la entidad
@Entity
@Table(name = "producto")
public class productoModel {

    // dev_JB - agregamos las siguientes etiquetas de springboot -> @ para darle las propiedades a las entidades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,  nullable = false)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double valor;
    private Long cantidad;

    // id
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    // nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    // descripcion
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    // precio
    public void setValor(Double valor){
        this.valor = valor;
    }
    public Double getValor(){
        return valor;
    }

    // cantidad
    public void setCantidad(Long cantidad){
        this.cantidad = cantidad;
    }
    public Long getCantidad(){
        return cantidad;
    }

}
