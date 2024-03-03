package com.mycompany.pruebatecnicaempleados;

import com.mycompany.pruebatecnicaempleados.logica.Controladora;
import com.mycompany.pruebatecnicaempleados.logica.Empleado;
import com.mycompany.pruebatecnicaempleados.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

public class PruebaTecnicaEmpleados {

    public static void main(String[] args) throws NonexistentEntityException {
        /*Declaracion de variables*/
        int opcion = 1;
        
        Scanner scanner = new Scanner(System.in);

        Controladora control = new Controladora();

        while (opcion > 0) {
            System.out.println(" ** Elige que acción deseas realizar ** \n \n"
                    + "1º Agregar un nuevo empleado  \n"
                    + "2º Listar o mostrar todos los empleados \n"
                    + "3º Actualizar la información de un empleado \n"
                    + "4º Eliminar un empleado \n"
                    + "5º Buscar empleados por cargo");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    Empleado empleado = new Empleado();
                    System.out.println("Ingresa los datos del nuevo empleado \n");                   
                    String nombre, apellido, cargo, fecha;
                    Double salario = null;
                    System.out.println("Ingresa el NOMBRE y ENTER para continuar  \n");
                    nombre = scanner.nextLine();
                    empleado.setNombre(nombre);
                    System.out.println("Ingresa el APELLIDO y ENTER para continuar  \n");
                    apellido = scanner.nextLine(); 
                    empleado.setApellido(apellido);
                    System.out.println("Ingresa el CARGO y ENTER para continuar  \n");
                    cargo =  scanner.nextLine();
                    empleado.setCargo(cargo);
                    System.out.println("Ingresa fecha de ingreso del empleado  DD MM AAAA \n");
                    fecha = scanner.nextLine(); 
                    empleado.setFechaDeInicio(fecha);
                    System.out.println("Ingresa el SALARIO del empleado \n");
                    salario = scanner.nextDouble();
                    empleado.setSalario(salario);
                    scanner.nextLine();
                    control.crearEmpleado(empleado); 
                    System.out.println("EMPLEADO CREADO CON ÉXITO");
                    System.out.println(" \n \n");     
                    
                    break;

                case 2:
                    List<Empleado> listarEmpleados = control.mostrarEmpleados();
                    for(Empleado emple: listarEmpleados){
                    System.out.println( emple.toString());}
                    break;
                case 3:    
                    
                    System.out.println("Indica el Id del usuario que quieres actualiza"); 
                    int idEdit = scanner.nextInt();
                    Empleado empleEdit = control.buscarEmple(idEdit);
                    System.out.println("Ingresa el NOMBRE del empleado, actualizado ");
                    nombre = scanner.nextLine();
                    empleEdit.setNombre(nombre); 
                    control.empleEdit(empleEdit);
                    
                    System.out.println("Ingresa el APELLIDO del empleado, actualizado ");
                    apellido = scanner.nextLine();
                    empleEdit.setNombre(apellido); 
                    control.empleEdit(empleEdit);
                    
                case 4:
                    System.out.println("Indica el Id del usuario que quieres eliminar ");
                    int idEliminar = scanner.nextInt();
                    control.eliminarEmple(idEliminar);
                    break;
                default:
                    System.out.println("i es mayor a tres.");
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

