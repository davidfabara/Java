package Clases;
//
class Inicializar implements Interfaz{// La clase Inicializar implementa a la unica interface Interfaz 

 private String resultado=""; // inicizalizamos el atributo con un valor por defecto 
 Inicializar(){} // Constructor sin parametros de la clase Inicializar 
 Inicializar(int []frecuencia,String frase){ // Constructor con 2 parametros de la clase Inicializar 
 ImpresionCadaDado(frecuencia,frase); // Llamada al metodo nativo ImpresionCadaDado de esta misma clase Inicializar 
 }
public  void ImpresionCadaDado(int []frecuencia,String frase){ // Metodo que recibe 2 parameteros , su objetivo es inicializar el atributo con el reporte de las frecuencias de 1-6 debida a las caras de los dados 
    System.out.println(frase);
    String result=""; //variable que se usará como acumulador de los reportes de cada frecuencia 
    result+=String.format("\n%s\n%s  %12s\n ",frase,"Cara ","Frecuencia"); // se utiliza String.format() para asignar a una variable String , una manipulacion de cadena con formato 
    int suma=0; // acumulador que servira para acumular los valores numericos de frecuencia para la posterior presentacion de los resultados 
    
    for(int y=1;y<frecuencia.length;y++){ // for tradicional para poder recorrer todos los elementos de frecuencia y poder asimilarlos en las variables result y suma 
            result+=String.format(" %5d %13d\n ",y,frecuencia[y]);
            suma+=frecuencia[y];
     }
     result+=String.format("   total :  \n " +suma); // Acumulacion con formato a la variable resut del anterior proceso , agregando al String el resultado final 
     this.resultado=result; 
      
         
    
}
public String Mostrar(Interfaz parametro){ // metodo mostrar de La superase Inicializar 
    return parametro.toString();
}
public String toString(){//Metodo por defecto toString() de la clase Inicilaizar 
    return resultado;
}
    
    
}