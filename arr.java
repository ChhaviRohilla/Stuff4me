import java.util.*;

public class arr{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size");
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.print("enter num");
        for(int i = 0 ; i < size ; i++){
            array[i] = sc.nextInt();
        }

        int ser = 9;
        for(int i = 0 ; i < size ; i++){
            if(array[i]==ser){
                System.out.printf("index: %d",i);
                break;
            }
        
        }
    }
}