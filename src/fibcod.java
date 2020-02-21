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
            for (int i = 0; i < suma.length(); i++) {
                double den = Math.pow(5,0.5); //raiz de 5
                double num = (Math.pow(1.618034,(suma.length()+1)-i))-(Math.pow(-0.618034,(suma.length()+1)-i));
                double fib = num/den;
                sumaA = sumaA + (fib*Character.getNumericValue(suma.charAt(i)));
                //revisar el ultimo input ¿por que da cero?
            }
            System.out.println(Math.round(sumaA)%524288);
        }
    }
}
