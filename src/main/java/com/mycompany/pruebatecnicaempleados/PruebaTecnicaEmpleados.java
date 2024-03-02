package com.mycompany.pruebatecnicaempleados;

import com.mycompany.pruebatecnicaempleados.logica.Controladora;
import com.mycompany.pruebatecnicaempleados.logica.Empleado;
import java.util.List;
import java.util.Scanner;


public class PruebaTecnicaEmpleados {

    public static void main(String[] args) {
        /*Declaracion de variables*/
        int opcion;
         Scanner scanner = new Scanner(System.in);


        
        Controladora control = new Controladora();
        
         System.out.println("Por favor presione 1 para listar empleados o cera para finalizar");
        
         /*Método para CREAR empleado */
        //Empleado emp3 = new Empleado(2, "Camilita", "Pina Ananena", 10.0, "13072007");
        //control.crearEmpleado(emp3); 
        opcion = scanner.nextInt();
        while(opcion > 0){
            opcion = scanner.nextInt();
            System.out.println( "op elegida" + opcion);
            List<Empleado>listarEmpleados = control.mostrarEmpleados();
             for(Empleado emple: listarEmpleados){
            System.out.println( emple.toString());
        }
        }
        
        /*Método para LEER los empleados */
        
        
       
                 
        /*Método para ELIMINAR los empleados */
        
    }
}
