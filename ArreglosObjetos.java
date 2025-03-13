/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosobjetos;

import javax.swing.JOptionPane;
import java.util.Random;

public class ArreglosObjetos {
    
    public static void main(String[] args) {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo:"));
        Estudiante arrEstudiantes[] = new Estudiante[tamanio];
        
        
        //Llenando el arreglo
        arrEstudiantes = llenar_Arreglo(arrEstudiantes);
        //Mostrando el arreglo
        mostrar_Arreglo(arrEstudiantes);
    }
    
     public static  String generar_nombre(){
         String nombre = "";
         String nombres[] = {
             "Ana",
             "Pedro",
             "Maria",
             "Juan",
             "Alicia",
             "Santiago",
             "Patricia",
             "Alexis",
             "Alexa",
             "Christian"
         };
         
         Random rand = new Random();
         int num = rand.nextInt(nombres.length)
         return nombres[num];
     }
    

    public static Estudiante[] llenar_Arreglo(Estudiante[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del estudiante " + (i+1)));
            String nombre = generar_nombre();
            String apellidos = JOptionPane.showInputDialog("Digite los apellidos del estudiante " + (i+1));
            
            //crear la instancia y agregarla al arreglo
            Estudiante estudiante_i = new Estudiante(cedula, nombre, apellidos);
            arreglo[i] = estudiante_i;
        }
        
        return arreglo;
    }

   
    public static void mostrar_Arreglo(Estudiante[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            JOptionPane.showMessageDialog(null, "Estudiante " + (i+1) + ":" + arreglo[i]);
        }
    }
    
}
