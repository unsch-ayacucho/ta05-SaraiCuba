
package pruebaClases;

import clases.Empleado;

public class PruebaEmpleado {

    public static void main(String[] args) {
        // Creamos Objeto
        Empleado Emp1 = new Empleado();
        
        //Asignamos valores a los atributos del objeto
        Emp1.areaLaboral = "nose";
        Emp1.nombre = "Sarai Cuba Fernandez";
        Emp1.codigo = 70397703;
        
        //Mostramos los atributos
        System.out.println(Emp1.areaLaboral);
        System.out.println(Emp1.nombre);
        System.out.println(Emp1.codigo);
        
        //Llamamos al metodo de la clase Empleado
        Emp1.calculo(5000,6);
    }
}
