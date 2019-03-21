package com.eiv.sumaeuler;

public class CalculoEulerAlt1Impl implements CalculoEuler{
  
    @Override
    public  long  calcular(int numero){
        long  resultado=0;
       
            resultado= (numero*(numero+1))/2;
        
        
   
        return resultado;
        
    }
    }



