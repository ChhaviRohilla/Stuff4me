import java.util.*; 

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();sc.nextLine();

        System.out.print("Enter + or - or * or /");
        String op = sc.next();
        char operator = op.charAt(0);

        
        if(operator == '+'){
            System.out.println(num1 + num2);
        }
        else if(operator == '-'){
            System.out.println(num1 - num2);
        }
        else if(operator == '*'){
            System.out.println(num1 * num2);
        }
        else if(operator == '/'){
            if(num2!=0){
                System.out.println(num1 / num2);
            }
            else{
                System.out.println("can't divide by 0");
            }
        }
        else{
            System.out.println("Invalid Opertor");
        }
    }
}