
package calculopositivo;
import java.util.Scanner;
public class CalculoPositivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double num1 = leer.nextDouble();
        //instanciar objeto tipo positivo o negativo
        PositivoNegativo tipo = new PositivoNegativo(num1);
        System.out.println("El numero: " + tipo.getNum());
       
        tipo.calculoPositivo();
        //pasar nuevo parametro set
        System.out.println("Digite un numero: ");
        num1 = leer.nextDouble();
        tipo.setNum(num1);
        System.out.println("El numero: " + tipo.getNum());
        tipo.calculoPositivo();
        
    }
    
}
