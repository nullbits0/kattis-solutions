import java.util.Scanner;

public class Posters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long P = sc.nextLong();
        long H = sc.nextLong();
        long T = sc.nextLong();
        
        long lo = 0, hi = T / P;
        while (lo < hi) {
            long mid = (lo + hi + 1) / 2;
            long timeNeeded = mid * P + Math.max(0, mid - 1) * 0 + H;
            long time = (mid - 1) * Math.max(P, H) + P + H;
            if (time <= T) lo = mid;
            else hi = mid - 1;
        }
        System.out.println(lo);
    }
}