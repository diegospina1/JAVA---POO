
package parimpar;

import javax.swing.JOptionPane;

public class PareImpar {
    
    private double num;

    public PareImpar(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String calculoPar(){
        
        String mensaje = " ";
        
        if((this.num % 2 == 0)&&(this.num != 0)){
            mensaje = "El numero es par";
            JOptionPane.showMessageDialog(null, mensaje);
            return mensaje;
        }
        else if(this.num == 0){
            mensaje = "El número es neutro";
            JOptionPane.showMessageDialog(null, mensaje);
            return mensaje;
        }
        else{
            mensaje = "El número es impar";
            JOptionPane.showMessageDialog(null, mensaje);
            return mensaje;
        }
    }
    
    
}
