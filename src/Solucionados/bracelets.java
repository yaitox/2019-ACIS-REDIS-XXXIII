package Solucionados;
//funcionaaaaa :D
//solo le falta la lectura de several cases
import java.util.*;
public class bracelets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenBrace = Integer.parseInt(scan.nextLine());
        String brace1 = scan.nextLine();
        String brace2 = scan.nextLine();
        int cont = lenBrace;
        for (int i = 0; i <lenBrace ; i++) {
            String last = brace2.substring(lenBrace-1); //coge el ultimo caracter
            String rest = brace2.substring(0,lenBrace-1); //coge del primero al penultimo caracter
            String newBrace2 = last+rest;

            for (int j = 0; j < lenBrace; j++) {

                if((newBrace2.charAt(j)=='R')&&(newBrace2.charAt(j) == brace1.charAt(j))){
                    cont = cont-1;
                }
            }
            brace2 = newBrace2;
        }
        System.out.println(cont);
    }
}
