package Main;



import GUI.GUI; // Importamos todas las clases a utilizar , importamos la clase GUI del componente GUI de nuestro proyecto 
import java.util.Random;
import javax.swing.JOptionPane;

public class Main { // // @@@ ESTUDIANTE : FABARA OJEDA DAVID FRANCISCO ____Clase que contiene el metodo Main 

   /**
 *PROGRAMA  QUE MUSTRA UNA GUI PARA INCICIZALIZAR DADOS PARA 1000 LANZAMIENTOS A VERIFICAR :
 * 1)El programa utiliza herencia y polimorfismo
 * 2)Se utiliza una GUI para inicizalizar los dados
 * 3) Se utiliza una GUI para ejecutar los dados 
 * 4)Se utilzia una gui para mostrar en pantalla la frecuencia o resultado.
 * 
 */
    public static void main(String[] args) { // @@@ ESTUDIANTE : FABARA OJEDA DAVID FRANCISCO 
        
       GUI gui=new GUI(); // Se declara un objeto para utilizarlo en nuestra clase de interfaz grafica 
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);  // Definimos en el metodo setVisible visivilidad activada , de lo contrario no seria vidible 
       
       
   }



}
