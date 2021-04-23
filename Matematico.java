
public class Matematico
{
   
    private Calculadora calculadora;
    
    public Matematico(Calculadora calculadora){
    this.calculadora =calculadora;
    }
    public void setCalculadora(Calculadora cal){
    calculadora = cal;
    }
    
    public String ecuacionRecta(double X1, double Y1,double x2, double y2){
    return calculadora.hallarEcuRecta(X1, Y1, x2, y2);
    }
    public String raices(int a, int b, int c){
    return calculadora.hallarRaices(a, b, c);
}
    public double calculoCateto(double hipo, double cateto){
    return calculadora.hallarCateto(hipo,cateto);
    }
    
    

    
  
}
