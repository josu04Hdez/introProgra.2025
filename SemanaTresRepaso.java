/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semanacuatro;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class SemanaCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean salida = true;
       do {
           JOptionPane.showMessageDialog(null, "Valor de la variable: " + salida);
           for (int i = 0; i < 3; i++) {
               JOptionPane.showMessageDialog(null, "Valor de la variable i: " + i);
               if(i==2){
                   salida = false; 
               } 
           }
       } while (salida);
    }
    
}
