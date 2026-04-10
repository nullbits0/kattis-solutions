package abbysabsolutes;

import java.util.Scanner;

public class Abbysabsolutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String r = "";
        for (int i = 0; i < k; i++) {
            int ko = sc.nextInt();
            int distN = n - ko, dist1 = ko -1;
            if (distN >= dist1) r += " 1";
            else r += " "+n;
        }
        System.out.println(r.trim());
    }
}
