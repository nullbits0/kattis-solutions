package blackthorn;

import java.util.Scanner;

public class Blackthorn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.contains("kth")) System.out.println("yes");
        else System.out.println("no");
    }
    
}
