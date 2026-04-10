package atmmaintenance;

import java.util.Scanner;

public class Atmmaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultado = "";
        int n = sc.nextInt(), k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            if (r<=k) {
                k -= r;
                resultado += "1";
            }else resultado += "0";
        }
        System.out.println(resultado);
    }
}
