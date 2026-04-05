/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ataleoftwoqueues;

import java.util.Scanner;
public class Ataleoftwoqueues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int ns = 0, ms = 0;
        for (int i = 0; i < n; i++) {
            ns += sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ms += sc.nextInt();
        }
        if (ns>ms) {
            System.out.println("right");
        }else if (ms>ns){
            System.out.println("left");
        }else{
            System.out.println("either");
        }
    } 
}
