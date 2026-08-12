import java.util.Scanner;

public class Kmh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nLine = sc.nextInt();
        sc.nextLine();
        int velocidadActual = 0;
        int maxVelocidad = 0;
        
        for (int i = 0; i < nLine; i++) {
            String senal = sc.nextLine();
            
            if (senal.equals("/")) {
                // Volver al nacional: múltiplo de 10 mayor que todo lo visto
                velocidadActual = ((maxVelocidad / 10) + 1) * 10;
            } else {
                velocidadActual = Integer.parseInt(senal);
                // Guardar el máximo visto para calcular el nacional después
                if (velocidadActual > maxVelocidad) {
                    maxVelocidad = velocidadActual;
                }
            }
            
            System.out.println(velocidadActual);
        }  
        sc.close();
    }
}