
package parimpar;

import javax.swing.JOptionPane;

public class ParImpar {

    public static void main(String[] args) {
        
        double num = 0;
        
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite un número"));
        
        PareImpar calculo = new PareImpar(num);
        calculo.calculoPar();
    }
    
}
