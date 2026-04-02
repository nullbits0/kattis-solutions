/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fyi;

import java.util.Scanner;
public class Fyi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String r = (numero > 5549999 && numero <=5559999) ? "1":"0";
        System.out.println(r);
    }
}
