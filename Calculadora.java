

public class Calculadora
{
    public String hallarRaices(int a, int b, int c){
double x1 =(-b+Math.sqrt(b*b-4*a*c))/(2*a);
double x2 =(-b-Math.sqrt(b*b-4*a*c))/(2*a);

        String cadena ="el resultado es x1="  +  x1  +  "y=x2"  +  x2;//auxi mi metodo esta bien, solo que el resultado no es muy estetico, xq siempre estan muy pegadas las letras :(
        
    return cadena;
    }
   public String hallarEcuRecta(double X1, double Y1,double x2, double y2){
   
       double pendiente = (y2-Y1)/(x2-X1);
       String ecuacion = "la ecuacion de la recta es Y= " +pendiente+ " x  luego " +(-pendiente*X1 + Y1);//auxi en esta parte es cuestion de gustos xq la ecuacion de la recta puede ser de 2 formas :Y=X+1 o X+1-Y=0 yo lo hice de la primera manera porque es mas estico espero que entienda.
       return ecuacion;
    }
    
    public double hallarCateto(double hipo, double cateto){
    double catetoRestante = Math.sqrt(hipo*hipo-cateto*cateto);
    return catetoRestante;
    }
    }


