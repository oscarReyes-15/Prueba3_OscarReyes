/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pureba3_oscarreyes;

import javax.swing.*;
        
public class Proyecto1 extends Proyecto1Clases {
    
    
    
    static void ResumenVentas(){}
    
    static void AplicacionDescuento(){}
    
    static void Ordenes(){
        //Instruccion
        JOptionPane.showMessageDialog(null, "Por cada orden marcar E, R o P por su respectiva orden");
        
        //
        String Nombre = JOptionPane.showInputDialog("Nombre de Cliente: ");
        String Orden = JOptionPane.showInputDialog("Orden: ");
        int Repetir = Integer.parseInt(JOptionPane.showInputDialog("Desea algo mas? si(1) no(0)"));
            switch (Repetir){
                case 1 -> {
                    Orden = JOptionPane.showInputDialog("Orden: ");
                    Repetir = Integer.parseInt(JOptionPane.showInputDialog("Desea algo mas? si(1) no(0)"));
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Prosiga");
                }
            }
            String Frecuente = JOptionPane.showInputDialog("Es cliente frecuente?: ");
            String Edad = JOptionPane.showInputDialog("Es de tercera Edad?: ");
        
    }
        
    
    
    static void IngresoPrecios(){
       E = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de combo Economico: "));
       R = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de combo Regular: "));
       P = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de combo Premium: "));
       
       Ordenes();
    }
    
    static void InicioPrograma(){
        JOptionPane.showMessageDialog(null, "Cajero Registrado: Bienvenido");
        
        IngresoPrecios();
    }
    
}
