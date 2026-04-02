/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aaaah;

import java.util.Scanner;
public class Aaaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String john = sc.nextLine(),medico = sc.nextLine();
        String resultado = (john.length() >= medico.length()) ? "go" : "no";
        System.out.println(resultado);
    }
}
