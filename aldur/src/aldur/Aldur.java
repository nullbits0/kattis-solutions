
package aldur;

import java.util.Scanner;

public class Aldur {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       sc.nextLine();
       long menor = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long edad = sc.nextLong();
            if (edad < menor) menor = edad;
        }
        System.out.println(menor);
    }  
}
