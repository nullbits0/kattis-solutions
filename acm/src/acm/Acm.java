package acm;

import java.util.HashMap;
import java.util.Scanner;

public class Acm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int acumulador = 0;
        HashMap<Character, Integer> penalidad = new HashMap<>();
        while (true) {
            int minutos = sc.nextInt();
            if (minutos == -1) break;
            char c = sc.next().charAt(0);
            String text = sc.next();
            if (text.equals("right")) {
                if (penalidad.containsKey(c)) {
                    acumulador += minutos + penalidad.get(c);
                    penalidad.remove(c);
                } else {
                    acumulador += minutos;
                }
                contador++;
            } else {
                if (penalidad.containsKey(c)) {
                    penalidad.put(c, penalidad.get(c) + 20);
                } else {
                    penalidad.put(c, 20);
                }
            }
        }
        System.out.println(contador + " " + acumulador);
    }
}
