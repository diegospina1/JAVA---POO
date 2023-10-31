/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniempresarial.entidades;

public class Trabajadores {
    
    private String nombres;
    private String apellidos;
    private String documento;
    private int tCargo;
    private double sueldoBase;
    private double horasT;
    private double horasN;
    private double valorH;

    public Trabajadores(String nombres, String apellidos, String documento, int tCargo, double sueldoBase, double horasT, double horasN, double valorH) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.tCargo = tCargo;
        this.sueldoBase = sueldoBase;
        this.horasT = horasT;
        this.horasN = horasN;
        this.valorH = valorH;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int gettCargo() {
        return tCargo;
    }

    public void settCargo(int tCargo) {
        this.tCargo = tCargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasT() {
        return horasT;
    }

    public void setHorasT(double horasT) {
        this.horasT = horasT;
    }

    public double getHorasN() {
        return horasN;
    }

    public void setHorasN(double horasN) {
        this.horasN = horasN;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }
    

    
    
    public String calculoSalario(){
        
        final double BONOEXTRA = 0.15;
        final double HORANOC = 0.20;
        String mensaje = " ";
        double totalNoc = 0;
        double totalDiu = 0;
        double totalSueldo = 0;
        
        if(this.tCargo == 1){
            
            totalDiu = this.horasT*this.valorH;
            totalNoc = this.horasN*this.valorH;
            totalNoc += totalNoc*HORANOC;
            
            totalSueldo = totalDiu + totalNoc;
            
            mensaje = "Su sueldo total es de: " + totalSueldo;
        }
        else{
            totalSueldo = this.sueldoBase + (this.sueldoBase*BONOEXTRA);
            
            mensaje = "Su sueldo total es de: " + totalSueldo;
        }
        
        
        return mensaje;
    }
    
}
