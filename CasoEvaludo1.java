/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaludo1;

/**
 *
 * @author Laboratorio
 */
public class CasoEvaludo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombreTrabajador = ""; 
        double salarioEmpleado = 0;
        String variableTemporal = "";
        nombreTrabajador = JOptionPane.showInputDialog("Digite su nombre");
        variableTemporal = JOptionPane.showInputDialog("Digite su salario");
        
        salarioEmpleado=Double.parseDouble(variableTemporal);
        
        salarioDeducciones=salarioEmpleado*0.0925*0.0508
        
        JOptionPane.showMessageDialog(null, "El nombre es " + nombreTrabajador + "\n" +
                                            "Las deducciones por concepto SEM Y IVM son por un total de:  "+ salarioDeducciones + "\n");
    }
    
}
