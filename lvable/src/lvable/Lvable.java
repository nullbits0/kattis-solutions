/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lvable;

import java.util.Scanner;
public class Lvable
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.nextLine();
        String palabra = sc.nextLine();
        
        if(palabra.contains("lv")){
            System.out.println(0);
        } else if (palabra.contains("l") || palabra.contains("v")){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
            
    }
}
