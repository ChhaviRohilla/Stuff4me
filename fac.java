import java.util.*;

public class fac{
    public static int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        System.out.print("enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fact(n);
        System.out.print(res);
        }
}