/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floors;

import java.util.Scanner;
public class Floors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numPiso = num;
        
        if (num >= 13) {
            numPiso++;
        }
        System.out.println(numPiso);
    }
    
}
