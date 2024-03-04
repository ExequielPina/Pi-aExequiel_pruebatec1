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
        int opcioelegida =0;
        String nombre, apellido, cargo, fecha;
        Double salario = null;
        
        Scanner scanner = new Scanner(System.in);
        Controladora control = new Controladora();

        while (opcion > 0) {
            System.out.println(" ** Elige que acción deseas realizar o cero para finalizar ** \n \n"
                    + "1º Agregar un nuevo empleado  \n"
                    + "2º Listar o mostrar todos los empleados \n"
                    + "3º Actualizar la información de un empleado \n"
                    + "4º Eliminar un empleado \n"
                    + "5º Buscar empleados por cargo");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.println("Haz elegido la opción: "+ opcion); 
                    Empleado empleado = new Empleado();
                    System.out.println("Ingresa los datos del nuevo empleado \n");                   
                    
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
                    System.out.println("\n");
                    System.out.println("EMPLEADO CREADO CON ÉXITO");
                    System.out.println(" \n \n");     
                    break;

                case 2:
                    List<Empleado> listarEmpleados = control.mostrarEmpleados();
                    for(Empleado emple: listarEmpleados){
                    System.out.println( emple.toString());}
                    System.out.println(" \n \n"); 
                    break;
                    
                case 3:                       
                    System.out.println("Indica el Id del usuario que quieres actualiza"); 
                    int idEdit = scanner.nextInt();
                    scanner.nextLine(); // 
                    Empleado empleEdit = control.buscarEmple(idEdit);
                    
                    System.out.println("Ingresa el NOMBRE del empleado, actualizado ");
                    nombre = scanner.nextLine();
                    empleEdit.setNombre(nombre); 
                                        
                    System.out.println("Ingresa el APELLIDO del empleado, actualizado ");
                    apellido = scanner.nextLine();
                    empleEdit.setApellido(apellido); 
                                      
                    System.out.println("Ingresa el CARGO del empleado, actualizado ");
                    cargo = scanner.nextLine();
                    empleEdit.setCargo(cargo); 
                                       
                    System.out.println("Ingresa el FECHA del empleado, actualizado ");
                    fecha = scanner.nextLine();
                    empleEdit.setFechaDeInicio(fecha); 
                                        
                    System.out.println("Ingresa el SALARIO del empleado, actualizado ");
                    salario = scanner.nextDouble();
                    empleEdit.setSalario(salario); 
                    control.empleEdit(empleEdit);
                    
                    System.out.println("EMPLEADO actualizado CON ÉXITO");
                    System.out.println(" \n \n"); 
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Indica el Id del usuario que quieres eliminar ");
                    int idEliminar = scanner.nextInt();
                    control.eliminarEmple(idEliminar);
                                 System.out.println(" ** Elige que acción deseas realizar ** \n \n"
                    + "1º Agregar un nuevo empleado  \n"
                    + "2º Listar o mostrar todos los empleados \n"
                    + "3º Actualizar la información de un empleado \n"
                    + "4º Eliminar un empleado \n"
                    + "5º Buscar empleados por cargo");
                    opcion = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Indica el cargo para poder listar los empleados que coinciden con el cargo indicado");
                    cargo = scanner.nextLine();                   
                    break;
                    
                default:
                    System.out.println("Finalizado");     
                    
                    
            }           

        }

    }

}

