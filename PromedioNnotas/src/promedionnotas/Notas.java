/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedionnotas;

import javax.swing.JOptionPane;

public class Notas {
    
    private int cantNotas;
    private double arrayNota[];

    public Notas(int cantNotas, double[] arrayNota) {
        this.cantNotas = cantNotas;
        this.arrayNota = arrayNota;
    }

    public int getCantNotas() {
        return cantNotas;
    }

    public void setCantNotas(int cantNotas) {
        this.cantNotas = cantNotas;
    }

    public double[] getArrayNota() {
        return arrayNota;
    }

    public void setArrayNota(double[] arrayNota) {
        this.arrayNota = arrayNota;
    }
    
    public String calculoProm(){
        
        double sumaN = 0;
        double promedio = 0;
        String mensaje = "El promedio es: ";
        
        for(int i = 0; i < this.arrayNota.length; i++){
            for(int j = 1;j < this.arrayNota.length; j++){
                sumaN = this.arrayNota[i] + this.arrayNota[j];
                
            }
        }
        promedio = sumaN / this.arrayNota.length;
        
        JOptionPane.showMessageDialog(null, mensaje + promedio);
        
        return mensaje;
    }
}

