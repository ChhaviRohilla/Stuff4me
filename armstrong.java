import java.util.*;

public class armstrong{
    public static boolean isArmstrong(int num){
        int org = num;
        int len = String.valueOf(num).length();

        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + (int)Math.pow(rem,len);
            num = num/10;
        }
        return sum == org;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter a num: ");
        int num = sc.nextInt();sc.nextLine();

        if(isArmstrong(num)){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("NOT Armstrong");
        }

    }
}