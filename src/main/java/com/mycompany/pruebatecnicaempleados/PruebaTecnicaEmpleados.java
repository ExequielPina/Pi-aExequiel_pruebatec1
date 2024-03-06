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
        String nombre, apellido, cargo, fecha;
        Double salario;

        Scanner scanner = new Scanner(System.in);
        Controladora control = new Controladora();

        System.out.println("\n");
        System.out.println("Prueba Técnica Nº 1 - Java Básico realizada por Exequiel Piña - ");
        System.out.println("\n");
        System.out.println("Aplicación de gestión de empleados de una empresa ");
        System.out.println("\n");
        while (opcion > 0) { //while que contiene toda la lógica del menú 
            System.out.println(" ** Elige que acción deseas realizar o cero para finalizar ** \n \n"
                    + "Nº 1 Agregar un nuevo empleado  \n"
                    + "Nº 2 Listar o mostrar todos los empleados \n"
                    + "Nº 3 Actualizar la información de un empleado \n"
                    + "Nº 4 Eliminar un empleado \n"
                    + "Nº 5 Buscar empleados por cargo");
            opcion = scanner.nextInt();
            System.out.println("\n");
            scanner.nextLine();
            switch (opcion) {
                case 1:// Case nº 1 el cual realiza el insert en la bbdd 
                    System.out.println("Haz elegido la opción Nº " + opcion + " agregar un nuevo empleado.");
                    System.out.println("\n");
                    Empleado empleado = new Empleado();
                    System.out.println("Ingresa los datos del nuevo empleado \n");
                    System.out.println("\n");

                    System.out.println("Ingresa el NOMBRE y ENTER para continuar  \n");
                    nombre = scanner.nextLine();
                    empleado.setNombre(nombre);
                    System.out.println("\n");
                    System.out.println("Ingresa el APELLIDO y ENTER para continuar  \n");
                    apellido = scanner.nextLine();
                    empleado.setApellido(apellido);
                    System.out.println("\n");
                    System.out.println("Ingresa el CARGO y ENTER para continuar  \n");
                    cargo = scanner.nextLine();
                    empleado.setCargo(cargo);
                    System.out.println("\n");
                    System.out.println("Ingresa fecha de ingreso del empleado formato = DD MM AAAA y ENTER para continuar\n");
                    fecha = scanner.nextLine();
                    empleado.setFechaDeInicio(fecha);
                    System.out.println("\n");
                    System.out.println("Ingresa el SALARIO del empleado \n");
                    salario = scanner.nextDouble();
                    empleado.setSalario(salario);
                    scanner.nextLine();
                    control.crearEmpleado(empleado);// llamada a la controladora, para crear el nuevo empleado.
                    System.out.println("\n");
                    System.out.println("EMPLEADO CREADO CON ÉXITO.");
                    System.out.println(" \n \n");
                    break;

                case 2://case nº 2 que lista todos los empleados que obtiene el ArrayList
                    System.out.println("Haz elegido la opción Nº " + opcion + " listar todos los empleados.");
                    System.out.println("\n");
                    List<Empleado> listarEmpleados = control.mostrarEmpleados();
                    for (Empleado emple : listarEmpleados) {
                        System.out.println(emple.toString());
                    }
                    System.out.println(" \n \n");
                    break;

                case 3: //case nº 3 localiza al usuario a editar y lo edita campo por campo 
                    System.out.println("Haz elegido la opción Nº " + opcion + " editar empleado.");
                    System.out.println("\n");
                    System.out.println("Indica el Id del usuario que quieres actualiza.");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine(); // 
                    Empleado empleEdit = control.buscarEmple(idEdit);

                    System.out.println("Ingresa el NOMBRE del empleado, actualizado. ");
                    nombre = scanner.nextLine();
                    empleEdit.setNombre(nombre);

                    System.out.println("Ingresa el APELLIDO del empleado, actualizado. ");
                    apellido = scanner.nextLine();
                    empleEdit.setApellido(apellido);

                    System.out.println("Ingresa el CARGO del empleado, actualizado. ");
                    cargo = scanner.nextLine();
                    empleEdit.setCargo(cargo);

                    System.out.println("Ingresa el FECHA del empleado, actualizado. ");
                    fecha = scanner.nextLine();
                    empleEdit.setFechaDeInicio(fecha);

                    System.out.println("Ingresa el SALARIO del empleado, actualizado. ");
                    salario = scanner.nextDouble();
                    empleEdit.setSalario(salario);
                    control.empleEdit(empleEdit);
                    System.out.println("\n");
                    System.out.println("empleado actualizado correctamente.");
                    System.out.println("\n");
                    scanner.nextLine();
                    break;

                case 4: //case nº 4 elimina a un usuario por el Id que se pasa por pantalla 
                    System.out.println("Haz elegido la opción Nº " + opcion + " eliminar empleado.");
                    System.out.println("Indica el Id del usuario que quieres eliminar. ");
                    int idEliminar = scanner.nextInt();
                    control.eliminarEmple(idEliminar);
                    System.out.println("Empleado ID: " + idEliminar + " borrado con éxito.");
                    System.out.println("\n");
                    scanner.nextLine();
                    break;

                case 5:
                    System.out.println("Haz elegido la opción Nº " + opcion + " buscar empleado por cargo.");
                    System.out.println("Indica el cargo para poder listar los empleados que coinciden con el cargo indicado.");
                    cargo = scanner.nextLine();
                List<Empleado> mostrarEmpleadosCargo = control.mostrarEmpleadosCargo(cargo);
                    System.out.println("\n");
                    for (Empleado emple : mostrarEmpleadosCargo) {
                        System.out.println(emple.toString());
                        System.out.println("\n");
                    }
                    break;


                default:
                    System.out.println("Finalizado");

            }

        }

    }

}
