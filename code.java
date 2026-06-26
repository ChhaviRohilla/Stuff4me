import java.util.*;

public class code{
    public static void fib(int n){
        int num1= 0;
        int num2= 1;

        System.out.print("0 ");

        if (n>1){
            for(int i=2; i<=n; i++){
                System.out.print(num2+" ");
                int temp=num1;
                num1=num2;
                num2=num1+temp;
            }
            
        }
    }

    public static int f(int n){
        if(n<=1){{
            if(n ==0 ){
                return 0;
            }else{
                return n;
            }
        }
            
        }
        return f(n-1) + f(n-2);
        
    }
    public static void main(String args[]){
        int count = 0; // Number of terms to display
        
        System.out.println("Fibonacci series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(f(i) + " ");
        }
    }
}