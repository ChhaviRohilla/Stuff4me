import java.util.*;

public class pow{
    public static double powFun(int x, int n){
        return (Math.pow(x,n));
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:  ");
        int x = sc.nextInt();

        System.out.print("enter n:  ");
        int n = sc.nextInt();

        double power = powFun(x, n);
        System.out.print(power);

    }
}