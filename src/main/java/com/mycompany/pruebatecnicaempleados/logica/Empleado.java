package com.mycompany.pruebatecnicaempleados.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Empleado implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int               id;
    private String        nombre;
    private String      apellido;
    private Double       salario;
    private String fechaDeInicio;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, Double salario, String fechaDeInicio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.fechaDeInicio = fechaDeInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(String fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", fechaDeInicio=" + fechaDeInicio + '}';
    }
    
    
      
}


