/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema2;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     menu();
    }
    public static int menu(){
        int opcion;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.print("Introduce la opcion deseada:" + "\n");
            System.out.print("1. Pies" + "\n");
            System.out.print("2. Yardas" + "\n");
            System.out.print("3. Millas" + "\n");
            System.out.print("0. Salir" + "\n");
            opcion=teclado.nextInt();
        }while (opcion <0 || opcion >=3);
        return opcion;
    }
    public static double calcularConversion(int opcionelegida){
        double resultado;
        switch(opcionelegida){
            case 1:
                
        }
    }
    
}
