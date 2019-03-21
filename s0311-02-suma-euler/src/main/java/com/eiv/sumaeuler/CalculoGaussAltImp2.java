package com.eiv.sumaeuler;

public class CalculoGaussAltImp2 implements CalculoEuler{
   
    public  long  calcular(int numero){
        long  resultado=0;
       for(int i=1;i<=numero;i++){
            resultado= resultado +i;
        
       }
   
        return resultado;
        
    }

}