package mkarloo;
import java.util.*;
public class Mkarlo {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner d=new Scanner(System.in);
        System.out.print("how many points do you want to use for finding the PI value : ");

        long p_num=d.nextLong();
        long c_num=0;
        for(long i=1;i<=p_num;i++){
            double x=r.nextDouble()*2-1;
            double y=r.nextDouble()*2-1;

            if(Math.sqrt(x*x+y*y)<=1){
                c_num++;
            }
        }
        double pi=4.0d*c_num/p_num;
        System.out.println("the amount of pi is about "+pi);
           
    }
}
