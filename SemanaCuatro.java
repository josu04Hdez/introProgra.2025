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
       
      Persona juan = new Persona();
      Persona pri = new Persona();
      Persona su = new Persona();
      juan.estudiar("Mate");
      pri.estudiar(null);
      su.estudiar("");
      
   /*
      Avion taca1 = new Avion();
      JOptionPane.showMessageDialog(null, "A que velocidad " + taca1.volar());
       */
    }
}
