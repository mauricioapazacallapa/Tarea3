
public class Matematico
{
   
    private Calculadora calculadora;
    
    public Matematico(Calculadora calculadora){
    this.calculadora =calculadora;
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
   
   
   
    //metodos de la anterior tarea
public String MayorMenorMedio(double n1, double n2, double n3){

        String respuesta="";
    if(n1>n2 && n2>n3){
     respuesta = "ya esta ordenado";
    }else{
        if(n1>n2 && n3>n2 && n1>n3){
        respuesta = "el mayor es n1, luego n3 y finalmente n2";
        }else{
            if(n2>n1 && n3>n1 && n2>n3){
            respuesta = "el mayor es n2, luego n3 y finalmente n1";
        }else{
            if(n2>n1 && n1>n3){
            respuesta ="el mayor es n2, luego n1 y finalmente n3";
            }else{
                if(n3>n1 && n2>n1 && n3>n2){
                respuesta ="el mayor es n3, luego n2 y finalmente n1";
                }else{
                    if(n3>n2 && n2>n1){
                    respuesta ="el mayor es n3, luego n2 y finalmente n1";
                    }else{
                    
                    }
                
                }
            
            }
        }
        }
        
   
    }
    return respuesta;
    }
   
     
    public double area(double a, double b){
    double calculoArea = a * b;
        return calculoArea;
    } 
    
    public double calcularDistancia(double X, double Y, double x, double y){
    double distancia=Math.sqrt((X-x)*(X-x)+(Y-y)*(Y-y));
    
    return distancia;
    
    }
     public String calcularCuadrante(double x, double y){
        String respuesta="";
        if(x>0 && y>0){
        respuesta="esta en el primer cuadrante"; 
        }else{
        if (x<0 && y<0){
        respuesta ="esta en el tercer cuadrante";
        }else{
            if(x<0 && y>0){
            respuesta="esta en el segundo cuadrante";
            }else{
                if(x>0 && y<0){
                respuesta ="esta en el cuarto cuadrante";
                }else{}
            }
        
        }
        }
        
        return respuesta;
        }
    
    
   
    
    

    
  
}
