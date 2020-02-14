import java.util.*;

public class kitchen {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int trays = Integer.parseInt(sc.nextLine());

        while(sc.nextLine()!= null) {
            List<Integer> widths = new ArrayList<Integer>();
            List<Integer> lengths = new ArrayList<Integer>();
            for (int i = 0; i < trays; i++) {
                String[] wl = sc.nextLine().split(" ");
                String w = wl[0];
                int width = Integer.parseInt(w);

                String l = wl[1];
                int length = Integer.parseInt(l);
                widths.add(width);
                lengths.add(length);
            }

            int wMax = Collections.max(widths);
            int lMax = Collections.max(lengths);

            //https://www.jstor.org/stable/2691523?seq=1
            //https://www.quora.com/Computational-Geometry-Can-one-rectangle-fit-inside-the-other
            //https://math.stackexchange.com/questions/847282/fitting-rectangle-inside-another-rectangle-in-diagonal

        }
    }
}
