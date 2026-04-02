/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package missingnumbers;

import java.util.Scanner;

public class Missingnumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int contador = 0;
    int[] numeros = new int[n];
    
    for (int i = 0;i < numeros.length;i++){
        numeros[i]= sc.nextInt();
    }
    int numero = 0;
    for (int i = 0;i < numeros.length;i++){
        numero++;
        if (numeros[i]==numero){
            continue;
        } else{
            System.out.println(numero);
            i--;
            contador++;
        }
    }
    if(contador == 0){
        System.out.println("good job");
    }
    
  }
}
