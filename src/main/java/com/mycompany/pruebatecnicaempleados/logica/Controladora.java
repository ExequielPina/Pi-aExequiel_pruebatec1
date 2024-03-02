package com.mycompany.pruebatecnicaempleados.logica;

import com.mycompany.pruebatecnicaempleados.persistencia.ControladoraPersistencia;
import java.util.List;





public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
   
    public void crearEmpleado(Empleado emp1) {
       controlPersis.crearEmpleado(emp1);
    }

    public List<Empleado> mostrarEmpleados(){
        return controlPersis.traerPlatillos();
    }
    
    
}
