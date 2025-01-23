/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dia = "";
        int diaSemana =  ;
        
        JOptionPane.showInputDialog(null, "Ingrese el dia de la semana del 1 al 7");
                
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Dato invalido");
                break;
        }
    }
    
}
