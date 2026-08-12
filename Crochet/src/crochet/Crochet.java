package crochet;

import java.util.Scanner;

public class Crochet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String text = sc.nextLine();
        String text2 = sc.nextLine();
        
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        String[] dia = text.split(" ");
        String[] hora = dia[1].split(":");
        int h1 = Integer.parseInt(hora[0]);
        int m1 = Integer.parseInt(hora[1]);

        String[] dia2 = text2.split(" ");
        String[] hora2 = dia2[1].split(":");
        int h2 = Integer.parseInt(hora2[0]);
        int m2 = Integer.parseInt(hora2[1]);
        
        int posicionDia1 = 0;
        int posicionDia2 = 0;
        
        for (int i = 0; i < days.length; i++) {
            if (dia[0].equals(days[i])) {
                posicionDia1 = i; 
            }
            if (dia2[0].equals(days[i])) {
                posicionDia2 = i;
            }
        }
        
        int minutosTotales1 = (posicionDia1 * 24 * 60) + (h1 * 60) + m1;
        int minutosTotales2 = (posicionDia2 * 24 * 60) + (h2 * 60) + m2;
        
        int diferenciaMinutos = minutosTotales2 - minutosTotales1;
        
        int diasPasados = diferenciaMinutos / (24 * 60);
        int horasRestantes = (diferenciaMinutos % (24 * 60)) / 60;
        int minRestantes = diferenciaMinutos % 60;
        
        System.out.println(diasPasados + " day, " + horasRestantes + " hours, " + minRestantes + " minutes");
    }
}