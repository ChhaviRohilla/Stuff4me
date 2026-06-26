import java.util.*;

class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId(){
        return this.courseId;
    }
    public String getCourseName(){
        return his.courseName;
    }
    public String getCourseAdmin(){
        return this.courseAdmin;
    }
    public int getQuiz(){
        return this.quiz;
    }
    public int getHandson(){
        return this.handson;
    }
    
}

public class courseProgram{
    public static int findAvgOfQuizByAdmin(Course arr[], String admin){
        int sum = 0;
        int count = 0;
        for(Course c: arr){
            if(admin.equalsIgnorecase(c.getCourseId())){
                sum = sum + c.getQuiz();
                count++;
            }
        }
        if(count>0){
            return sum/count;
        } 
        return 0;
        
    }
    public static Course[] sortCourseByHandsOn(Course arr[], int val){
        ArrayList<Course> list = new ArrayList<Course>();
        for(Course c : arr){
            if(val> c.getHandson()){
                list.add(c);
            }
        }
        list.sort();
        if(list.isEmpty()){
            return null;
        }
        return list.toArray(new Course[0]);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Course arr[] = new Course[4];
        for(int i = 0; i < 4 ; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.next();sc.nextLine();
            String c = sc.next();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Course(a, b, c, d, e);
        }
        courseProgram obj = new courseProgram();
    
        int res = obj.findAvgOfQuizByAdmin(arr, Nisha);
    //    Course[] cou = new Course[];/
        if(res == 0){
            System.out.println("No Course found.");
        }
        else{
            System.out.println(res);
        }
    }
}