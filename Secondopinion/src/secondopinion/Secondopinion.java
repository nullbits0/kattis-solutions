/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondopinion;

import java.util.Scanner;
public class Secondopinion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hora = num/3600, minuto = (num%3600)/60, segundo = num % 60;  
        System.out.println(hora+" : "+minuto+" : "+segundo);
    }
}
