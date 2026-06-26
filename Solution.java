import java.util.Arrays;
import java.util.*;

class Employee{
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public int getID(){
        return this.employeeId;
    }
    public String getName(){
        return this.employeeName;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }

    public Employee( int employeeId, String employeeName, int age, char gender, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}
public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Number of Object
        int numObj = sc.nextInt();
        Employee emp[] = new Employee[numObj];

        //Details
        for (int i = 0 ; i < numObj ; i++){
            int a = sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            char d = sc.next().charAt(0);
            double e = sc.nextDouble();

            emp[i] = new Employee(a, b, c, d, e);
        }

        //Get age
        int a = sc.nextInt();
        Employee res= getEmployeeWithSecondLowestSalary(emp);
        if(res == null){
              System.out.println("NULL");
        }
        else{
              System.out.println(res.getID() + "#" + res.getName());
        }
        int n = countEmployeesBasedOnAge(emp, a);
        if(n == 0){
            System.out.println("No employee found for the given age");
        }
        else{
            System.out.println(n);
        }
    }

    public static Employee getEmployeeWithSecondLowestSalary(Employee arr[]){
        if(arr.length < 2){
            return null;
        }
        Arrays.sort(arr,(e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()));
        
        double lowest = arr[0].getSalary();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].getSalary()>lowest){
                return arr[i];
            }
        }
        return null;
    }

    public static int countEmployeesBasedOnAge(Employee arr[], int a){
        int count =0;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i].getAge() == a){
                count++;
            } 
        }
        return count;
    }
}