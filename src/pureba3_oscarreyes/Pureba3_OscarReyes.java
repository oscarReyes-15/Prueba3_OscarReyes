/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pureba3_oscarreyes;

import javax.swing.JOptionPane;

public class Pureba3_OscarReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diccionario
        int Opcion;
        
        Opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea ver el ejercicio 1 o 2: (Apretar 1 para el primero y 2 para el segundo): "));
        
        if (Opcion == 1){
            //Proyecto1
            Proyecto1.InicioPrograma();
        } else if (Opcion == 2){
            //Proyecto2
            Proyecto2.InicioPrograma();
        } else {
            JOptionPane.showMessageDialog(null, "No ingreso una opcion correcta :( ");
            System.exit(0);
        }
    }
    
}
