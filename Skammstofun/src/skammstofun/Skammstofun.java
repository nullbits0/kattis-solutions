/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skammstofun;

import java.util.Scanner;
public class Skammstofun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String text = sc.nextLine();
        
        String[] palabras = text.split(" ");
        
        String siglas = "";
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                if (Character.isUpperCase(palabra.charAt(0))) {
                    siglas += palabra.charAt(0);
                }
            }
        }
        System.out.println( siglas);
    }
    
}
