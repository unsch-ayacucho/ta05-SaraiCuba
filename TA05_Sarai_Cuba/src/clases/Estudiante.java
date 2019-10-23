package clases;

import java.util.ArrayList;

public class Estudiante {
    
    //Declaramos los atributos
    private int codigo;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    String _apellidos;
    String _especialidad;
    
    //constructor
    public Estudiante(){
        
    }
    
    public Estudiante(int nota1, int nota2, int nota3, int nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    //Creamos el metodo promedio
    public int promedio(int nota1,int nota2, int nota3, int nota4){
        
        //creamos una lista.
        ArrayList<Integer> notas = new ArrayList();
        
        //agregamos notas a la lista.
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        
        //Recorremos la lista para saber cual es la nota menor
        int min = notas.get(0);
        for(int i=0;i<notas.size();i++){
            if(notas.get(i)<min){
                min = notas.get(i);
            }
        }
        for(int i=0;i<notas.size();i++) {
            if(notas.get(i)== min){
               notas.remove(i);
            }
        }
        
        //Promedio de las notas
        int Promedio = (notas.get(0)+notas.get(1)+notas.get(2))/4;
        return Promedio;    
    }
}
