/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculardosnumero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido a tu calculadora");
        System.out.println("Elige entre dos numeros enteros");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numerouno = input.nextInt();
        System.out.println("el primer numero es " + numerouno);
        System.out.println("ingresa tu segundo numero");
        int numerodos = input.nextInt();
        System.out.println("el segundo numero es " + numerodos);
        System.out.println("Menu");
        int resultado ;
        
               
        //Men?
        System.out.println("Escoje una variable matematica");
        
        String variable = input.next(); 
        
        switch (variable){
            case "+":
                System.out.println("suma");
                resultado = numerouno + numerodos;
                System.out.println("el resultado es " + resultado);
                break;
            case "-":
                System.out.println("resta");
                resultado = numerouno - numerodos;
                System.out.println("el resultado es " + resultado);
                break;
            case "*":
                System.out.println("multiplicacion");
                resultado = numerouno * numerodos;
                System.out.println("el resultado es" + resultado);
                break;
            case "/":
                System.out.println("division");
                resultado = numerouno / numerodos;
                System.out.println("el resultado es " + resultado);
                break;
            default:
                System.out.println("Salir");
                break;
        }
    }
}
