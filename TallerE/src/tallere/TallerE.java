
package tallere;

import co.edu.uniempresarial.entidades.Trabajadores;
import javax.swing.JOptionPane;

public class TallerE {

    public static void main(String[] args) {
        
        String arreglo[] = {"Administrativo", "Obrero"};
        String names = JOptionPane.showInputDialog("Dame el nombre");
        String lastNames = JOptionPane.showInputDialog("Dame el apellido");
        String document = JOptionPane.showInputDialog("Dame el documento");
        int cargo = JOptionPane.showOptionDialog(null, "Elija su cargo", "Cargo", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
        double sueldoB = 0;
        double valorHora = 0;
        double horasTrabajadas = 0;
        double horasNoc = 0;
        
        if(cargo == 1){
            valorHora = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor por hora de trabajo"));
            horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de horas diurnas trabajadas"));
            horasNoc = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de horas nocturnas trabajadas"));
        }
        else{
            sueldoB = Double.parseDouble(JOptionPane.showInputDialog("Introduzca su sueldo base"));
        }
        
        Trabajadores miTrabajador = new Trabajadores(names, lastNames, document, cargo, sueldoB, horasTrabajadas, horasNoc, valorHora);
        JOptionPane.showMessageDialog(null, "Nombre: " + names +  "\n" + "Apellido: " + lastNames + "\n" + "Documento: " + document +  "\n" + "Cargo: " + arreglo[cargo] + "\n" +miTrabajador.calculoSalario());
    }
    
}
