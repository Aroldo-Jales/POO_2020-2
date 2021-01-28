package ATV_07;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = null;
        
        try {
            palavra = 1;
        } catch (NullPointerException e) {
            System.out.println("String nula!");
        } catch (Exception e) {
            System.out.println("Ocorreu alguma excecao!");
        } finally {
            System.out.println("Finally!");
        }  
    } 
}
