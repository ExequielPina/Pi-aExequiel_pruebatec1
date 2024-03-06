package com.mycompany.pruebatecnicaempleados.logica;

import com.mycompany.pruebatecnicaempleados.persistencia.ControladoraPersistencia;
import com.mycompany.pruebatecnicaempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
   
    public void crearEmpleado(Empleado emp1) {
       controlPersis.crearEmpleado(emp1);
    }

    public List<Empleado> mostrarEmpleados(){
        return controlPersis.traerEmpleados();
    }

    public void eliminarEmple(int idEliminar) throws NonexistentEntityException {
        controlPersis.eliminarEmple(idEliminar);
    }

    public Empleado buscarEmple(int idEdit) {
       return controlPersis.buscarEmple(idEdit);
    }

    public void empleEdit(Empleado empleEdit) {
        controlPersis.empleEdit(empleEdit);
    }    

    public List<Empleado> mostrarEmpleadosCargo(String cargo){
        
        return controlPersis.traerEmpleadosCargo(cargo);
    }
}
