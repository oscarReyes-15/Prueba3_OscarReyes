/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pureba3_oscarreyes;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Proyecto2 {
    
    static double R, C, i, n; 
    
    static void salidaDatos(){
        //Mensaje
        JOptionPane.showMessageDialog(null, "Su Monto en el momento de vencimiento es: Lps." + C);
    
    }
    
    static void Calculo(){
        //Caluclo con formula
        C = R * (1 - Math.pow((1 + i), -n) / i);
        
        //Mensaje
        salidaDatos();
    }
    
    static void CalculoAnticipado(){
        //Caluclo con formula
        C = (R * (1 + i)) * (1 - Math.pow((1 + i), -n) / i);
        
        //Mensaje
        salidaDatos();
    }
    
    static void AnticipadaDatos(){
        //Entrada de Datos
       R = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su renta o pago por periodo: "));
       i = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tasa de Interes: "));
       n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de pagos: "));
       
       //Calculo de datos
       CalculoAnticipado();
    }
    
    static void entradaDatos(){
       //Entrada de Datos
       R = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su renta o pago por periodo: "));
       i = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tasa de Interes: "));
       n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de pagos: "));
       
       //Calculo de datos
       Calculo();
    }
    
    static void AnticipadaNo(){
        //Entrada a escoger
        int Elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga (1) para calcular su anualidad ordinaria y (2) para su extraordinaria"));
        
        //Segun elegir que funcion se corre
        switch (Elegir){
            case 1 -> {
                entradaDatos();
                break;
            }
            case 2 -> {
                AnticipadaDatos();
                break;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "No ingreso una opcion correcta!!");
                AnticipadaNo();
            }
        }
    }
    
    static void InicioPrograma(){
        JOptionPane.showMessageDialog(null, "Calculo Anualidad: Bienvenido");
        AnticipadaNo();
    }
    
}
