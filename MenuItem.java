/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuitem;

import javax.swing.JOptionPane;
/**
 *
 * @author josue
 */
public class MenuItem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        int opcion;
        do {
            String menu = "1. Verificar edad\n2. Calcular factorial\n3. Calcular precio final\n4. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcion) {
                case 1:
                    verificarEdad();
                    break;
                case 2:
                    calcularFactorial();
                    break;
                case 3:
                    calcularPrecioFinal();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
    
    public static void verificarEdad() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String primerApellido = JOptionPane.showInputDialog("Ingrese su primer apellido:");
        String segundoApellido = JOptionPane.showInputDialog("Ingrese su segundo apellido:");
        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento:"));
        
        Persona persona = new Persona(nombre, primerApellido, segundoApellido, anioNacimiento);
        JOptionPane.showMessageDialog(null, persona.mostrarDatos());
    }
    
    public static void calcularFactorial() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo:"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número no es entero positivo.");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial);
    }
    
    public static void calcularPrecioFinal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precioCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra del producto:"));
        double ganancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ganancia deseada:"));
        
        Producto producto = new Producto(nombre, precioCompra, ganancia);
        JOptionPane.showMessageDialog(null, producto.mostrarDatos());
    }
}
   
