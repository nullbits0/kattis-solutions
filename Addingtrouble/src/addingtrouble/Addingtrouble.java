/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package addingtrouble;

import java.util.Scanner;
public class Addingtrouble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        String decidir = (c == a+b) ? "correct!" : "wrong!";
        System.out.print(decidir);
    }
}
