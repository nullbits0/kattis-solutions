/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fractionalsequence;

import java.math.BigInteger;
import java.util.Scanner;

public class FractionalSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long contador = 0;
        long escalon = 1;
        while(contador + escalon < n){
            contador += escalon;
            escalon++;
        }
        long indice = n - contador - 1;
        if (indice == 0) System.out.println(escalon);
        else{
            long g = BigInteger.valueOf(indice).gcd(BigInteger.valueOf(escalon)).longValue();
            System.out.println(escalon + " " + (indice/g)+ "/"+(escalon/g));
        }
    }
    
}
