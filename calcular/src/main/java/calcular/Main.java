/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

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
       
        
        // aui empiezo
        System.out.println("Calculadora");
        System.out.println("calcular 2 numeros enteros");
        System.out.println("menu");
        System.out.println("Escoja 1,2,3,4 5 segun corresponda");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. division");
        System.out.println("4. multiplicacion");
        System.out.println("5. Salir");
        Scanner input =new Scanner (System.in);
        System.out.println(" ingrese numero 1");
        int variable1 = input.nextInt();
        System.out.println("ingrese numero 2");
        int variable2 = input.nextInt();
        int opcion = input.nextInt();
        
        //Empiza logica aqui
    
        int var = 0;
        while (var !=5){
        //instrucciones
        var++;}
        
        //int variable =5;
        String calculadora = "5";
        //creacion swich
        switch (calculadora){
        case "1":
        System.out.println("esta es la obcion suma");
        break;
        case "2":
        System.out.println("esta es la que resta");
        break;
        case "3":
        System.out.println("esta es la que divide");
        break;
        case "4":
        System.out.println("esta es la que multiplica");
        break;
        case "5":
        System.out.println("opcion por defecto");
        break;
     }
     
     }
}
 
