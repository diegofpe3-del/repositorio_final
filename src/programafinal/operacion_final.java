/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programafinal;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class operacion_final {
public static void main(String[] args){
//declarando variables
String cliente;
double compra1,compra2,compra3,tc,pc;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Ingresar el nombre del cliente: ");
cliente=lectura.next();
System.out.print("Ingresar el monto de la compra 1: ");
compra1=lectura.nextDouble();
System.out.print("Ingresar el monto de la ccompra 2: ");
compra2=lectura.nextDouble();
System.out.print("Ingresar el monto de la ccompra 3: ");
compra3=lectura.nextDouble();
//proceso de datos
tc = compra1+compra2+compra3;
pc = tc/3;
//salida de datos
System.out.println("El monto total de las compras es :" +tc);
System.out.println("El promedio de compras es:" + pc);
}        
}
