package com.eiv.sumaeuler;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Ingese un nro:");
        Scanner s = new Scanner(System.in);
        String sNumero=s.nextLine();
        int numero=Integer.valueOf(sNumero);
 s.close();     
    CalculoEuler sumaeuler=new CalculoGaussAltImp2();
   long  resultado=sumaeuler.calcular(numero);
    System.out.println("Suma de Gauss=" + resultado);
    }

}
