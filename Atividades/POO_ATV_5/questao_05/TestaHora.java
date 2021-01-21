package ATV_05;

import java.util.Scanner;

public class TesteHora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hora: ");
        int h = scan.nextInt();
        System.out.println("Minutos: ");
        int m = scan.nextInt();
        System.out.println("Segundos: ");
        int s = scan.nextInt();
        
        Hora hora = new Hora(h,m,s);
        hora.imprimeHora();
    }
}
