/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Clases.Ejecutar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form Uml
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Iniciar Programa Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random numerosAleatorios = new Random();
        JOptionPane.showMessageDialog(null,"PRESIONE ACEPTAR PARA INICIALIZAR LOS DADOS  "); // Se utiliza una GUI para peticion al usuario para inicialziar los dados 
        int[] frecuencia1 =new int[7];//Se establecen un array de 7 elementos pero debido a que los numeros aleatorios generan valores del 0-5 pero se suma 1 en tiempo de ejecucion , y se contabiliza desde el subindice cero porque no existe caras de dados de valor cero
        int[] frecuencia2 =new int[7];//Se establecen un array de 7 elementos pero debido a que los numeros aleatorios generan valores del 0-5 pero se suma 1 en tiempo de ejecucion , y se contabiliza desde el subindice cero porque no existe caras de dados de valor cero
         
       int[] frecuencia =new int[13];// Este array servira para el experimento de los resultados de lanzar a la vez los dos dados por lo tanto sera desde 2 hasta 12 el numero de caras Y recordar que el ultimo elemento llega hasta 12 de subindice
       
        int suma=0;
        String frase1="\nDatos : Dado1" ,frase2="\nDatos : Dado2";
        
        int x1,x2; // elementos que nos serviran el subindices de cada frecuencia para asimilar lo valores aleatorios generados 
        
       // System.out.printf("%5s\n%5s\n%5s\n","VALORES GENERADOS(se puede ver como se incrementan en una unidad cada frecuencia al repetirse la misma","Tambien podemos ver que las frecuencias empiezan desde uno , no desde cero por la expresion [1+numerosAleatorios.nextInt(6) y luego con frecuencia[1+x]","Nota :Las caras representan los subindices asimilados por frecuencia[w]");
        
        JOptionPane.showMessageDialog(null,"PRESIONE ACEPTAR PARA EJECUTAR  LOS DADOS  "); // Se utiliza una GUi para poder ejecutar todos los procesos 
        System.out.println("Todos los lanzamientos\nValor Dado1    Dado2");
        for(int tiro =1; tiro<=1000;tiro++){
            x1=(int)(Math.random()*6); //Siempre llegará hasta 6 este valor aleatorio suministrado
            x2=(int)(Math.random()*6);//Siempre llegará hasta 6 este valor aleatorio suministrado
          // x1=numerosAleatorios.nextInt(6);//Ojo esto no cambiara en dada a la linea 14 del codigo de la ev a distancia , simplemente uso el subindice para imprimir frecuencia[%d]
          // x2=numerosAleatorios.nextInt(6);
           ++frecuencia1[1+x1];//No queremos frecuencia[0] pues con los calculos aislamos ese valor , como el arreglo tiene una longitud de 7 elementos empezando desde frecuencia[0] hasta frecuencia[6] , se empieza desce frecuencia[1]  debido a los calculos
           ++frecuencia2[1+x2];
           System.out.printf("Dado1: %d  y Dado2: %d : \n",x1+1,x2+1);
           ++frecuencia[2+x1+x2]; 
           
          
            //Nota . La diferencia entre ++x , y x++ , es que el 1ero se incremente y se asigna o se imprime el valor incrementado , mientras que el otro en la siguiente linea manipula el incremento pero no en la linea que ha sido asignada 
           //Nota: la instruccion  z=++frecuencia[1+x] , significa que se incrementa ejm ++frecuencia[3] significa frecuencia[3]=frecuancia[3]+1 q se asignaria a nuestro valor z; 
        }
        Ejecutar []inicializar =new Ejecutar[2];
        
        String resultados="";
        inicializar[0]=new Ejecutar(frecuencia1,frase1);
      
       inicializar[1]=new Ejecutar(frecuencia2,frase2);
      //  System.out.println("Se puede ver pese a que se repitiera una misma frecuencia hasta 10 veces seguidas , ejm frecuencia[2] por dies veces siendo las demas 0 en frecuencia ,pese a ello  se incrementa un contador un una unidad devida a  (n) iteraciones , entonces es irrelevante la frecuecia que aparesca , la sumatoria de las frecuencias siempre sera 10 porque los valores de frecuencias solo se incrementan en una unidad permitiendo un valor maximo para cada frecuencia de 10 ,muy dificil q se produsca este caso pero no es imposible y se produce las demas serian cero , por lo tano siepre se mantendra esas 10 frecuencias");
        for(int i=0;i<2;i++){
                resultados+=inicializar[i];// se llama implicitamente al metodo toString() de la superclase Inicizalizar 
        }
        JOptionPane.showMessageDialog(null,resultados,"RESULTADOS DE LANZAMIENTO DE DADOS ",JOptionPane.PLAIN_MESSAGE); // Se utiliza una GUI para mostrar los resultados de los 1000 lanzamientos agrupados 
        // ImpresionCadaDado()
      //  System.out.println("Nota:Estos valores son a ese valor de lanzamiento lanzar de dado1 y dado2 (conjuncion)por lo que sus valores \nson acordes a estas condiciones ");
      
        resultados=String.format("\n %s %12s\n ","suma de dado1 y dado2 ","Frecuencia");//sE PRESENTARAN LOS RESULTADOS DE EL LANZAMIENTO DE DADO 1 Y DADO 2 A LA VEZ
        for(int y=2;y<frecuencia.length;y++){ //Recordar que frecuancia[1] no existe al ser la sumatoria de los 2 dados el minimo (1+1)
            resultados+=String.format(" %5d %35d\n ",y,frecuencia[y]);
            suma+=frecuencia[y];
        }
        
       resultados+=String.format("   total frecuencias:   " +suma);
       JOptionPane.showMessageDialog(null,resultados,"RESULTADOS DE LANZAMIENTO DE AMBOS DADOS A LA VEZ",JOptionPane.PLAIN_MESSAGE);
        //System.out.println("Nota: cada lanzamiento implica 2 dados , y la suma maxima entre los resultados de ambos(conjuncion) es  12 \nlas frecuencias implican el valor que se presenta dado1 y dado 2 un valor especifico de 2 a 12 \n por ello los valores variaran pues son tomados en tiempo de ejecucion ");
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}