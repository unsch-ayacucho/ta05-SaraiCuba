
package clases;

public class Empleado {
    //Atributos
    public int codigo;
    public String nombre;
    public String areaLaboral;
    public int sueldo;
    public int horasExtras;
    
    //Metodo Constructor vacio
    public Empleado(){
        
    }
    //Metodo Constructor 
    public Empleado(int sueldo, int horasExtras, int codigo, String nombre, String areaLaboral){
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.codigo = codigo;
        this.nombre = nombre;
        this.areaLaboral = areaLaboral;
    }
    //Metodo para calcular todos los datos
    public String calculo(int sueldo, int horasExtras){
        
        double AFP = 0.11;
        double SNP = 0.13;
        double salud = 0.3;
        int a,b,c,TotalDescuento,MontoExtra;
        int SueldoBasic = 930;
        int SueldoNeto;
        
        //Horas Extras
        MontoExtra = (SueldoBasic/240)*horasExtras;
        
        //Calculamos descuento por AFP
        a = (int) (sueldo*AFP);
        System.out.println("Descuento por AFP es: "+a);
        
        //Calculamos descuento por SNP
        b = (int) (sueldo*SNP);
        System.out.println("Descuento por SNP es: "+b);
        
        //Calculamos descuento por salud
        c = (int) (sueldo*salud);
        System.out.println("Descuento por Salud es: "+c);
        
        //Total de descuento
        TotalDescuento = (a+b+c);
        System.out.println("Descuento total es: "+TotalDescuento);
        
        //Sueldo total
        System.out.println("Sueldo total es: "+sueldo);
        
        //Sueldo Neto
        SueldoNeto = (sueldo - TotalDescuento)+MontoExtra;
        System.out.println("EL sueldo neto es: "+SueldoNeto);
        
       return "";
        
    }
}
