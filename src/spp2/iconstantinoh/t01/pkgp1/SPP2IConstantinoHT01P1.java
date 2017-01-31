/*
 * change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Iván Constantino Hernández
//A01411529 IIS
package spp2.iconstantinoh.t01.pkgp1;
import java.util.Scanner;
        
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb= new Scanner(System.in);
      // Declaración de variables
       String res;
        int mat;
        double cal1, cal2, cal3, cal4, cal5, pro;
    
        //Paso 1.- Pedir datos
        System.out.println("Calculadora de promedio");
        System.out.println("Introduce tu matrícula");
        mat=kb.nextInt();
        System.out.println("Introduce la primer calificación");
        cal1=kb.nextDouble();
        System.out.println("Introduce la segunda calificación");
        cal2=kb.nextDouble();
        System.out.println("Introduce la tercer calificación");
        cal3=kb.nextDouble();
        System.out.println("Introduce la cuarta calificación");
        cal4=kb.nextDouble();
        System.out.println("Introduce la quinta calificación");
        cal5=kb.nextDouble();
        
        pro= (cal1+cal2+cal3+cal4+cal5)/5;
        System.out.println("Tu promedio es: "+pro);
        
        if (pro>=7){
            res="Aprobado";
        }     
        else {
            res= "Reprobado";
        }
        System.out.println("Usted está: "+res);            
        
    }
    
}
