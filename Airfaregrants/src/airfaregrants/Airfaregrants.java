/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airfaregrants;

import java.util.Scanner;
public class Airfaregrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] precios = new int[num];
        for (int i = 0; i < num; i++) {
            precios[i] = sc.nextInt();
        }
        int max = precios[0];
        int min = precios[0];
        for (int precio : precios) {
            if (precio > max ) {
                max = precio;
            }
            if (precio < min) {
                min = precio;
            }
        }
        int limite = max/2;
        int reembolso = Math.min(limite, min);
        System.out.println(min - reembolso);   
    }
}