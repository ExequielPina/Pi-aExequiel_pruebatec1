package com.mycompany.pruebatecnicaempleados.persistencia;

import com.mycompany.pruebatecnicaempleados.logica.Empleado;
import java.util.List;


public class ControladoraPersistencia {
    
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearEmpleado(Empleado emp1) {
        empleJpa.create(emp1);
    }

    public List<Empleado> traerPlatillos(){
        return empleJpa.findEmpleadoEntities();
    }
}
