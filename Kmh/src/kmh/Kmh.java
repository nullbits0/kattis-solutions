package kmh;

import java.util.Scanner;

public class Kmh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nLine = sc.nextInt();
        sc.nextLine();
        int maxVisto = 0;
        for (int i = 0; i < nLine; i++) {
            String senal = sc.nextLine();
            
            if (senal.equals("/")) {
                int limiteNacional = ((maxVisto / 10) + 1) * 10;
                System.out.println(limiteNacional);
            } else {
                int velocidadActual = Integer.parseInt(senal);
                
                if (velocidadActual > maxVisto) {
                    maxVisto = velocidadActual;
                }
                
                System.out.println(velocidadActual);
            }
        }  
        sc.close();
    }
}