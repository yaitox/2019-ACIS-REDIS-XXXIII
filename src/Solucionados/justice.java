package Solucionados;
//ya funciona
import java.util.*;

public class justice {
    public static void main(String[] args){
        List<Long> listh = new ArrayList<>();
        List<Long> listv = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String linea;

        while(!(linea = scan.nextLine()).equals("0  0")){
            long suma = 0;
            long h = Long.parseLong(linea.split("  ")[0]);
            long v = Long.parseLong(linea.split("  ")[1]);

            for (int i = 0; i <h ; i++) {
                String nuevaLinea = scan.nextLine();
                listh.add(Long.parseLong(nuevaLinea));
            }

            for (int j = 0; j <v ; j++) {
                String nuevaLinea = scan.nextLine();
                listv.add(Long.parseLong(nuevaLinea));
            }

            if (v<h){
                h=v;
            }

            for (int k = 0; k <h ; k++) {
                if(listh.get(k) > listv.get(k)){
                    suma++;
                }
            }
            listh.clear();
            listv.clear();
            System.out.println(suma);
        }
        scan.close();
    }
}
