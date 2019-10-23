
package clases;

public class Ventana {
    
    //Atributos
    public String tituloDePrograma;
    public String botonesDeControl;
    public String MenuOpciones;
    public int tamañoDeVentana;
    
    //Metodo constructor vacio
    public Ventana(){
        
    }
    //Metodo constructor 
    public Ventana(String a, String b, String c, int d){
        
        tituloDePrograma = a;
        botonesDeControl = b;
        MenuOpciones = c;
        tamañoDeVentana = d;
    }
    
    //Metodo Eliminar un archivo
    public String EliminarArchivo(){   
        return "Elminiar archivo: X ";
    }
    
    //Metodo Abrir archivo
    public String AbrirArchivo(){
        return "Abrir archivo: Y ";
    }
    
    //Metodo Minimizar programa
    public String Minimizar(){
        return "Minimizar ventana";
    }
    
    //Metodo Maximizar programa
    public String Maximizar(){
        return "Maximizar ventana ";
    }
}
