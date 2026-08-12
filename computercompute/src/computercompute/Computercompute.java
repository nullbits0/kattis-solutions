
package computercompute;

import java.util.Scanner;

public class Computercompute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primerX = sc.nextDouble();
        double primerY = sc.nextDouble();
        double segundaX = sc.nextDouble();
        double segundaY = sc.nextDouble();
        System.out.println(Math.sqrt(((segundaX-primerX)*(segundaX-primerX))+((segundaY-primerY)*(segundaY-primerY))));
    }
    
}
