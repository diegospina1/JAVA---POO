
package calculopositivo;

public class PositivoNegativo {
    private double num;
    //constructor > inicializador de atributos
    public PositivoNegativo(double num1){
        this.num = num1;
        
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
    
    //metdo de orden
    public void calculoPositivo(/*recibir argumentos*/){
        if(this.num > 0 ) System.out.println("Es positivo");    
        else if (this.num < 0 ) System.out.println("Es negativo");    
    }
    
}
