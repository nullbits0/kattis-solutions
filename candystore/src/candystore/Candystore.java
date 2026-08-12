package candystore;

import java.util.Scanner;

public class Candystore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Q = sc.nextInt();
        sc.nextLine();
        String[] nombres = new String[N];
        for (int i = 0; i < N; i++) {
            nombres[i] = sc.nextLine();
        }

        for (int i = 0; i < Q; i++) {
            String inicial = sc.nextLine();
            boolean encontrado = false;
            boolean ambiguo = false;
            String isNombre = null;

            for (int j = 0; j < nombres.length; j++) {
                String letras = nombres[j].charAt(0) + String.valueOf(nombres[j].charAt(nombres[j].indexOf(" ") + 1));
                if (inicial.equals(letras)) {
                    if (encontrado) {
                        ambiguo = true;
                        break;
                    }
                    encontrado = true;
                    isNombre = nombres[j];
                }
            }

            if (ambiguo) {
                System.out.println("ambiguous");
            } else if (encontrado) {
                System.out.println(isNombre);
            } else {
                System.out.println("nobody");
            }
        }
    }
}
