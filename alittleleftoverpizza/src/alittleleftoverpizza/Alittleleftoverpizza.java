/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alittleleftoverpizza;

import java.util.Scanner;
public class Alittleleftoverpizza {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cs = 0;
        int cm = 0;
        int cl = 0;
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            int p = sc.nextInt();
            if (p == 0) continue;
            if (t.equals("S")) {
                cs += p;
            }else if(t.equals("M")){
                cm += p;
            }else{
                cl += p;
            }
        }
        int r = (int)(Math.ceil((double)cs/6) + Math.ceil((double)cm/8) + Math.ceil((double)cl/12));
        System.out.println(r);  
    }
}
