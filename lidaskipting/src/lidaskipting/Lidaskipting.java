/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lidaskipting;

import java.util.Scanner;
public class Lidaskipting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int suma = 0;
        for (char c : n.toCharArray()) {
            suma += c - '0';
        }
        String r = (suma%3 == 0) ? "Jebb":"Neibb";
        System.out.println(r);
    } 
}
