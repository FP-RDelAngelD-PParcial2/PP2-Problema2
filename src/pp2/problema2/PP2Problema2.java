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
     muestraResultado(calcularConversion(menu()));
    }
    public static int menu(){ //Creacion de un menu para dar al usuario a elegir la opcion deseada
        int opcion;
        Scanner teclado = new Scanner (System.in);
        do{
            System.out.print("Introduce la opcion deseada:" + "\n");
            System.out.print("1. Pies" + "\n");
            System.out.print("2. Yardas" + "\n");
            System.out.print("3. Millas" + "\n");
            opcion=teclado.nextInt();
        }while (opcion <0 || opcion >3);
        return opcion;
    }
    public static double calcularConversion(int opcionelegida){
        double resultado;
        switch(opcionelegida){
            case 1:
                resultado=convertirPies();
                break;
            case 2:
                resultado=convertirYardas();
                break;
            case 3:
                resultado=convertirMillas();
                break;
            default:
                resultado=0;
            }
        return resultado;
    }
    public static double convertirPies(){
        double m = solicitarDatos("metros para convertir a pies");
        return m*3.28084;
    }
    public static double convertirYardas(){
        double m = solicitarDatos("metros para convertir a yardas");
        return m*1.094;
    }
    public static double convertirMillas(){
        double m = solicitarDatos("metros para convertir a millas");
        return m*.000621;
    }
    public static double solicitarDatos(String d){ //Solicita los valores
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d + "\n");
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static void muestraResultado(double a){
        System.out.print("El resultado es " + a);
    }
}
