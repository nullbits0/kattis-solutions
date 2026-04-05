/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abc;

import java.util.Arrays;
import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        Arrays.sort(num);
        String t = sc.next();
        String r = "";
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)=='A') r+=num[0]+" ";
            else if(t.charAt(i)=='B') r+=num[1] + " ";
            else r+= num[2]+ " ";
        }
        System.out.println(r.trim());
    }
}
