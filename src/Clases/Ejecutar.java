package Clases;

public class Ejecutar extends Inicializar { //Herencia efectuada , todos los miembros de la superclase Inicalizar son heredados hacia la clase Ejecutar 
public Ejecutar (int []frecuencia,String frase){
    super(frecuencia,frase);
    
}

public String  toString(){ // Metodo toString() de la subclase Ejecutar 
    return super.toString();
}
}