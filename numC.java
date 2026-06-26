import java.util.*;

public class numC{
    public static void numPlay(int n){
        int pos=0;
        int neg=0;
        int zero=0;

        int i;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("enter:  ");
            int a = sc.nextInt();

            if (a>0){
                pos++;
            }
            else if (a<0){
                neg++;
            }
            else{
                zero++;
            }
            n--;
        }while(n!=0);
        
    System.out.println("pos: "+ pos);
    System.out.println("neg: "+neg);
    System.out.println("zero: "+zero);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many times:  ");
        int n = sc.nextInt();

        numPlay(n);
    }
}