
package apaxiaaans;

import java.util.Scanner;

public class Apaxiaaans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        String resultado = "";
        
        for (int i = 0; i < nombre.length(); i++) {
            if ((i == 0 || nombre.charAt(i) != nombre.charAt(i - 1))) resultado += nombre.charAt(i); 
        }
        System.out.println(resultado);
    }
    
}
