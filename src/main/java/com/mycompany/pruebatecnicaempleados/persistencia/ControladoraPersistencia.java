package com.mycompany.pruebatecnicaempleados.persistencia;

import com.mycompany.pruebatecnicaempleados.logica.Empleado;
import com.mycompany.pruebatecnicaempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearEmpleado(Empleado emp1) {
        empleJpa.create(emp1);
    }

    public List<Empleado> traerEmpleados() {
        return empleJpa.findEmpleadoEntities();
    }

    public void eliminarEmple(int idEliminar) throws NonexistentEntityException {
        empleJpa.destroy(idEliminar);
    }

    public Empleado buscarEmple(int idEdit) {
        return empleJpa.findEmpleado(idEdit);
    }

    public void empleEdit(Empleado empleEdit) {
        try {
            empleJpa.edit(empleEdit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> traerEmpleadosCargo(String cargo) {
        List<Empleado> findEmpleadoEntities = empleJpa.findEmpleadoEntities();
        List<Empleado> empleadosCargos = new ArrayList<>();

        for (Empleado empleado : findEmpleadoEntities) {

            if (cargo.equalsIgnoreCase(empleado.getCargo())) {
                empleadosCargos.add(empleado);

            }

        }
        return empleadosCargos;
    }
}
