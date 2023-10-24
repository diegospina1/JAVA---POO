
package repasojava;

import co.edu.uniempresarial.entidades.Cliente;
import javax.swing.JOptionPane;

public class RepasoJava {

    public static void main(String[] args) {
        
        String names = JOptionPane.showInputDialog("Dame el nombre");
        String lastNames = JOptionPane.showInputDialog("Dame el apellido");
        String document = JOptionPane.showInputDialog("Dame el documento");
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Dame el salario"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
        
        //Instanciar objeto de tipo Cliente
        Cliente miCliente = new Cliente(names,lastNames,document,salary,age);
        JOptionPane.showInputDialog(null, ""+miCliente.clasificarCliente);
        //Instanciar otro objeto y utilizar el segundo constructor
    }
    
}
