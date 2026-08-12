
package aboveaverage;

import java.util.Scanner;

public class Aboveaverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            double[] notas = new double[N];
            double suma = 0;
            for (int j = 0; j < N; j++) {
                notas[j] = sc.nextInt();
                suma += notas[j];
            }
            double promedioNotas = suma/N;
            
            int estudianteSuperior = 0;
            for (int j = 0; j < notas.length; j++) {
                if (notas[j]>promedioNotas) {
                    estudianteSuperior++;
                }
            }
            double promedio = (estudianteSuperior * 100.0)/N;
            System.out.printf("%.3f%%\n", promedio);
        }
    }
    
}
