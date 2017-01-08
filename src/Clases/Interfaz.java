package Clases;

import java.lang.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *PROGRAMA  QUE MUSTRA UNA GUI PARA INCICIZALIZAR DADOS PARA 1000 LANZAMIENTOS A VERIFICAR :
 * 1)El programa utiliza herencia y polimorfismo
 * 2)Se utiliza una GUI para inicizalizar los dados
 * 3) Se utiliza una GUI para ejecutar los dados 
 * 4)Se utilzia una gui para mostrar en pantalla la frecuncia o resultado.
 * 
 */
interface Interfaz{
    
public void ImpresionCadaDado(int []frecuencia,String frase);
public String  Mostrar(Interfaz parametro);
}