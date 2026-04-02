/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package afjormun;

import java.util.Scanner;
public class Afjormun{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < a; i++){
            String text = sc.nextLine();
            System.out.println(Character.toUpperCase(text.charAt(0))+text.substring(1).toLowerCase());  
        }   
    }
}
