
package autori;

import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder iniciales = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(i == 0)iniciales.append(text.charAt(i));
            if (text.charAt(i)=='-') {
                iniciales.append(text.charAt(i + 1));
            }
        }
        System.out.println(iniciales.toString());
    }
    
}
