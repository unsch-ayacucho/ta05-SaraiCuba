
package pruebaClases;

import clases.Ventana;

public class PruebaVentana {

    public static void main(String[] args) {
        //Creamos Objeto de la clase Ventana
        Ventana Ven1 = new Ventana();
        Ven1.tituloDePrograma = "Explorador de Archivos";
        Ven1.MenuOpciones = "Opciones";
        Ven1.tamañoDeVentana = 50*50;
        Ven1.botonesDeControl= "Cerrar, Minimizar, Maximizar";
        
        //Llamamos a los metodos de la clases Ventana
        
        Ven1.AbrirArchivo();
        Ven1.EliminarArchivo();
        Ven1.Maximizar();
        Ven1.Minimizar();
        
        //Mostramos resultados 
        System.out.println("Titulo del programa: "+Ven1.tituloDePrograma);
        System.out.println(Ven1.MenuOpciones);
        System.out.println("Tamaño del programa: "+Ven1.tamañoDeVentana);
        System.out.println(Ven1.botonesDeControl);
        System.out.println(Ven1.AbrirArchivo());
        System.out.println(Ven1.EliminarArchivo());
        System.out.println(Ven1.Maximizar());
        System.out.println(Ven1.Minimizar());
    }
    
}
