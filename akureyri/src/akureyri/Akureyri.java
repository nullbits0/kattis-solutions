
package akureyri;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Akureyri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> conteoCiudades = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            String nombre = sc.nextLine();
            String ciudad = sc.nextLine();
            conteoCiudades.put(ciudad, conteoCiudades.getOrDefault(ciudad, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : conteoCiudades.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
   
}
