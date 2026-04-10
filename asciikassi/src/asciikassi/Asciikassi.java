package asciikassi;

import java.util.Scanner;
public class Asciikassi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*char[][] canva = new char[n+2][n+2]; //mi lento
        for (int fi = 0; fi < canva.length; fi++) {
            for (int ci = 0; ci < canva[fi].length; ci++) {
                if (fi == 0 || fi == canva.length-1) {
                    if (ci == 0 || ci == canva[fi].length-1) canva[fi][ci]='+';
                    else canva[fi][ci]='-';
                }else if (ci == 0 || ci == canva[fi].length-1) canva[fi][ci]='|';
                else canva[fi][ci]=' ';
                System.out.print(canva[fi][ci]);
            }
            System.out.println();
        }*/
        /* lento
        System.out.print("+");
        for (int i = 0; i < n; i++) System.out.print("-");
        System.out.println("+");
        
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) System.out.print(" ");
            System.out.println("|");
        }
        
        System.out.print("+");
        for (int i = 0; i < n; i++) System.out.print("-");
        System.out.println("+");
        */
        StringBuilder sb = new StringBuilder();
        
        sb.append("+");
        for (int i = 0; i < n; i++) sb.append("-");
        sb.append("+\n");
        
        for (int i = 0; i < n; i++) {
            sb.append("|");
            for (int j = 0; j < n; j++) sb.append(" ");
            sb.append("|\n");
        }

        sb.append("+");
        for (int i = 0; i < n; i++) sb.append("-");
        sb.append("+\n");
        
        System.out.print(sb);
    }
}
