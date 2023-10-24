/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniempresarial.entidades;

/**
 *
 * @author uedocentes
 */
public class Cliente {
    //Atributos de clase
    private String nombres;
    private String apellidos;
    private String documento;
    private double ingresoMensual;
    private int edad; 
    
    //Contructor: Para dar valores iniciales a los atributos (inicializar). Reciben parámetros en diferente cantidad

    public Cliente(String nombres, String apellidos, String documento, double ingresoMensual, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.ingresoMensual = ingresoMensual;
        this.edad = edad;
    }

    public Cliente(double ingresoMensual, int edad) {
        this.ingresoMensual = ingresoMensual;
        this.edad = edad;
    }
    //Métodos de acceso (get y set) para los atributos encapsulados (private)

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

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String clasificarCliente(){
        //Variables de ámbito local.
        double salarioMinimo = 500;
        String mensaje = "";
        if((this.edad < 18)&&(this.ingresoMensual < salarioMinimo)){
            mensaje = "CLIENTE NO POTENCIAL";
        }
        else if((this.edad < 18) && (this.ingresoMensual >= salarioMinimo)){
            mensaje = "CLIENTE BÁSICO-POTENCIAL";
        }
        else if ((this.edad > 65)&&(this.ingresoMensual <= salarioMinimo)){
            mensaje = "CLIENTE NO POTENCIAL";
        }
        else{
            mensaje = "CLIENTE POTENCIAL";
        }
        if(this.ingresoMensual > (salarioMinimo*6)){
            mensaje = "CLIENTE POTENCIAL";
        }
        
        return mensaje;
        
    }
    
}
