
package alphabetsoup;

import java.util.Scanner;

public class Alphabetsoup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letras = sc.nextLine();
        String abc= "ABCDEFGHIJKLMNOPQRRSTUVWXYZ";
        char[] abecedario = abc.toCharArray();
        int contador = 0;
        String faltantes = "";
        for (int i = 0; i < abecedario.length; i++) {
            if (letras.contains(String.valueOf(abecedario[i]))) {
                contador++;
                continue;
            }else faltantes +=String.valueOf(abecedario[i]);
                
            if (contador == 26) break;
        }
        if (contador == 26) System.out.println("Alphabet Soup!");
        else System.out.println(faltantes);
    }
    
}
