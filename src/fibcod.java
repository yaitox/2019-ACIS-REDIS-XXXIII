//no está solucionadoooooo
import java.math.*;
import java.util.*;

public class fibcod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String linea;
        String linea2;

        while(!(linea2 = scan.nextLine()).equals("0")){
            linea = scan.nextLine();
            String m[] = linea.split(" ");
            String suma = "";
            for (int i = 0; i <m.length ; i++) {
                if((i+1)%2==0) {
                    for (int j = 0; j < Integer.parseInt(m[i]); j++) {
                        suma = suma + "0";
                    }
                }
                else{
                    for (int j = 0; j < Integer.parseInt(m[i]) ; j++) {
                        suma = suma +"1";
                    }
                }
            }
            double sumaA = 0;
            for (int i = 0; i < suma.length()+1; i++) {
                double f = (0.4472135955)*(Math.pow(1.6480333,i+1)-(Math.pow(-0.618033,i+1)));
                sumaA = sumaA + (f* Double.parseDouble(String.valueOf(suma.charAt(suma.length()-i))));
            }
            System.out.println(Math.round(sumaA)%524288);
        }
    }
}
