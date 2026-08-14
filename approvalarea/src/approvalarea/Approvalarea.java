
package approvalarea;

import java.util.Scanner;

public class Approvalarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long u = sc.nextLong();
        if (u ==0) System.out.println("0E-100");
        else System.out.println(Math.PI*u);
    }
    
}
