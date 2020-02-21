import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kitchen {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        String m;
        List<Integer> answer = new ArrayList<>();
        while(!(m=br.readLine()).equals("")) {
            int cont=1;
            List<Integer> res = new ArrayList<>();
            List<Integer> dX=new ArrayList<>();
            List<Integer> dY=new ArrayList<>();

            int n=Integer.parseInt(m);

            for(int i = 0; i< n; i++) {
                int x=input.nextInt();
                int y=input.nextInt();



                res.add(x*10+y);
            }
            Collections.sort(res);
            Collections.reverse(res);


            for(int i=0;i<res.size();i++) {
                dX.add(res.get(i)/10);
                dY.add(res.get(i)%10);
            }

            for(int k = 0; k < n-1; k ++) {




                if(((dX.get(k)>=dX.get(k+1))||(dX.get(k)>=dY.get(k+1)))&&((dY.get(k)>=dX.get(k+1))||(dY.get(k)>=dY.get(k+1)))){
                    continue;
                }

                cont++;

            }
            answer.add(cont);



        }
        for(int answe : answer) {
            System.out.println(answe);
        }

    }
}
