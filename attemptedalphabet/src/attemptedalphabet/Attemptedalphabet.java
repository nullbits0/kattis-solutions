
package attemptedalphabet;

import java.util.HashMap;
import java.util.Scanner;

public class Attemptedalphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        HashMap <Character, Boolean> letras = new HashMap<>();
        for(char c : text.toCharArray()) letras.put(c, true);
        StringBuilder faltantes = new StringBuilder();
        for(char c = 'a'; c <= 'z'; c++){
            if (!letras.containsKey(c)) {
                faltantes.append(c);
            }
        }
        if (faltantes.length() == 0) {
            System.out.println("Good job!");
        }else System.out.println(faltantes);
    }
    
}
