/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aterriblefortress;

import java.util.Scanner;
public class Aterriblefortress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        for (int i = 0; i < num; i++) {
            int b = sc.nextInt(); 
            total += b;
        }
        System.out.println(total);
    }
}
