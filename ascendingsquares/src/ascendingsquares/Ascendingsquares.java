
package ascendingsquares;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ascendingsquares {

    public static void main(String[] args) throws IOException {
        // BufferedReader es considerablemente más rápido que Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input == null || input.trim().isEmpty()) return;

        int N = Integer.parseInt(input.trim());

        // StringBuilder gestiona la memoria de forma eficiente
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 1; i <= N; i++) {
            // (long) i * i calcula directamente el cuadrado del número
            sb.append((long) i * i);
            
            if (i < N) {
                sb.append(", ");
            }
        }
        sb.append("]");

        // Imprimimos la cadena construida de una sola vez
        System.out.println(sb.toString());
    }
}