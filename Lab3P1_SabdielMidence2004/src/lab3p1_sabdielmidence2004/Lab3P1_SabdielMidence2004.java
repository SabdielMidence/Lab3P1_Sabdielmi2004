/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_sabdielmidence2004;

import java.util.Scanner;

public class Lab3P1_SabdielMidence2004 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int salir = -1;
        do {
            System.out.println("\nBIENVENIDOS A LA LAB 3");    
            System.out.println("1) DivisiOn sin / (1.75 puntos).");
            System.out.println("2) Piedra, papel o tijeras (2 puntos).");
            System.out.println("3) Zigzag (4 puntos).");
            System.out.println("0) Salir del programa.");
            System.out.print("\nIngrese una opcion: ");
            salir = leer.nextInt();
            switch (salir) {//inicio del menu
                case 1:
                    int conciente = 0;
                    System.out.println("\n----- DIVIDIR NUMERO -----");
                    System.out.println("Ingrese un dividendo entero que sea mayor que 1: ");
                    int dividendo = leer.nextInt();
                    //validad que ingrese un numero positivo
                    if (dividendo < 1) {
                        System.out.println("Ingrese un dividendo entero que SEA MAYOR que 1: ");
                        dividendo = leer.nextInt();
                    }
                    System.out.println("Ingrese un divisor entero que sea mayor que 1: ");
                    int divisor = leer.nextInt();
                    //validad que ingrese un numero positivo
                    if (divisor < 1) {
                        System.out.println("Ingrese un divisor entero que sea mayor que 1: ");
                        divisor = leer.nextInt();
                    }
                    int divendo2 = dividendo;
                    while (dividendo >= divisor) {//inicio del while
                        dividendo -= divisor;
                        conciente++;
                    }//fin del while
                    System.out.println(divendo2 + " / " + divisor + " = " + conciente + " y sobran " + dividendo);
                    break;
                case 2:
                    System.out.println("BIENVENIDO A PIEDRA, PAPEL O TIJERAS");
                    System.out.println("0) Piedra");
                    System.out.println("1) Papel");
                    System.out.println("2) Tijera");
                    System.out.print("\nIngrese su opcion (J1): ");
                    int jugar1 = leer.nextInt();
                    System.out.print("\nIngrese su opcion (J2): ");
                    int jugar2 = leer.nextInt();
                    if (jugar1 == 0 && jugar2 == 2 || jugar1 == 1 && jugar2 == 0 || jugar1 == 2 && jugar2 == 1) {
                        System.out.println("GANO JUGADOR 1");
                    } else {
                        System.out.println("GANO JUGADOR 2");
                    }
                    if (jugar1 == jugar2) {
                        System.out.println("EMPATE");
                    }

                    break;
                case 3:
                    int tama = 0;
                        System.out.print("Ingrese la base del ZIGZAG: ");
                        tama = leer.nextInt();
                        System.out.println("Debe de ingresar un numero mayor o igual a 6");
                        for (int i = 0; i < tama; i++) {
                            for (int j = 0; j < tama-i; j++) {
                                System.out.print(" ");
                            }//fin del 2do for
                            for (int k = 0; k < i*2+1; k++) {
                                    System.out.print("*");   
                            }//fin del tercer for
                            System.out.println(""); 
                        }//fin del primer for
                    
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    salir = leer.nextInt();
            }//fin del menu 
        } while (salir != 0);
    }
}
