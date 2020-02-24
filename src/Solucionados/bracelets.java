package Solucionados;
//funcionaaaaa :D
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bracelets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line=br.readLine()).equals(""))
        {
            int lenBrace = Integer.parseInt(line);
            String brace1 = br.readLine();
            String brace2 = br.readLine();
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
}
