import java.util.*;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary ){
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getID(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDesignation(){
        return this.designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}

class Company{
    private String companyName;
    private Employee[] employees;
    private int numEmployees;

    Company( String companyName, Employee[] employees, int numEmployees ){
        this.companyName = companyName;
        this.employees = employees;
        this.numEmployees = numEmployees ;
    }

    public double getAverageSalary(){
        double sum = 0.00;
        for(Employee emp : employees){
            sum = sum + emp.getSalary();
        }
        return sum/employees.length;
    }

    public double getMaxSalary(){
        double max = 0;
        for(Employee emp : employees){
            if(max<emp.getSalary()){
                max = emp.getSalary();
            }
        }
        return max;
    }

    public Employee[] getEmployeesByDesignation(String designation){
        int relen = 0;
        for(Employee emp : employees){
            if(designation.equalsIgnoreCase(emp.getDesignation())){
                relen++;
            }
        }
        Employee arr[] = new Employee[relen];
        int j = 0;
        for(Employee emp: employees){
            if(designation.equalsIgnoreCase(emp.getDesignation())){
                int id = emp.getID();
                String name = emp.getName();
                String design = emp.getDesignation();
                double salary = emp.getSalary();

                arr[j] = new Employee(id, name, design, salary);
                j++;
            }
        }
        System.out.println("Employees with designation: " + designation);
        return arr;
    }
}

public class Answer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter company name: ");
        String cn = sc.nextLine();
        
        System.out.print("Enter number of employees: ");
        int len = sc.nextInt();sc.nextLine();

        System.out.println("Enter employee details: ");

        Employee obj[] = new Employee[len];
        for(int i = 0 ; i <len ; i++){
            System.out.println("Employee" + (i+1) + ":");

            System.out.print("Enter id:");
            int a = sc.nextInt();sc.nextLine();

            System.out.print("Enter name:");
            String b = sc.nextLine();

            System.out.print("Enter designation:");
            String c = sc.nextLine();

            System.out.print("Enter salary:");
            double d = sc.nextDouble();sc.nextLine();

            obj[i] = new Employee(a,b,c,d);
        }

        Company cbj = new Company(cn, obj, len);

        double sal = cbj.getAverageSalary();
        System.out.println("Average salary:" + sal);

        double max = cbj.getMaxSalary();
        System.out.println("Max salary:" + max);

        Employee a[] = cbj.getEmployeesByDesignation("Engineer");
        for(int i = 0 ; i <a.length; i++){
            System.out.print("ID:" + a[i].getID());
            System.out.print(", Name:" + a[i].getName());
            System.out.print(", Designation:" + a[i].getDesignation());
            System.out.print(", Salary:" + a[i].getSalary());
        }
    }
}