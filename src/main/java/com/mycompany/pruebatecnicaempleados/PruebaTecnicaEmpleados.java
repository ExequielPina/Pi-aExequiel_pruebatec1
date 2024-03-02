package com.mycompany.pruebatecnicaempleados;

import com.mycompany.pruebatecnicaempleados.logica.Controladora;
import com.mycompany.pruebatecnicaempleados.logica.Empleado;
import com.mycompany.pruebatecnicaempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class PruebaTecnicaEmpleados {

    public static void main(String[] args) throws NonexistentEntityException {
        /*Declaracion de variables*/
        int opcion=1;
        
        Scanner scanner = new Scanner(System.in);

        Controladora control = new Controladora();

        while(opcion >0){
            System.out.println("Elige que acción deseas realizar " +
                    "1º Agregar un nuevo empleado "+ 
                    "2º Listar o mostrar todos los empleados"+ 
                    "3º Actualizar la información de un empleado" +
                    "4º Eliminar un empleado" + 
                    "5º Buscar empleados por cargo");
            opcion = scanner.nextInt();
            if(opcion == 2){
                List<Empleado> listarEmpleados = control.mostrarEmpleados();
                for(Empleado emple: listarEmpleados){
            System.out.println( emple.toString());
        }
            }
            
        }
            
            
        
        /*Método para CREAR los empleados */
        //Empleado emp3 = new Empleado("Susana", "González", "Gerente", 800.0, "0711196.");
        //control.crearEmpleado(emp3); 
        
        /*Método para LEER los empleados (listar todos los empleados) */
        //List<Empleado> listarEmpleados = control.mostrarEmpleados();
        
        //int idEliminar = 2;   
        /*Método para ELIMINAR los empleados */
        //control.eliminarEmple(idEliminar);
        /*Método para ACTUALIZAR los empleados */
//        int idEdit =4;
//        Empleado empleEdit = control.buscarEmple(idEdit);
//       // empleEdit.setNombre("Pedro");
//        empleEdit.setFechaDeInicio("09-09-2011");
//        control.empleEdit(empleEdit);
    }
}
