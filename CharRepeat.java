import java.util.*;

public class CharRepeat {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder result = new StringBuilder();

        int count = 1;


        for(int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i) == str.charAt(i+1)) {

                count++;

            }
            else {

                result.append(str.charAt(i));
                result.append(count);

                count = 1;
            }
        }


        // add last character
        result.append(str.charAt(str.length()-1));
        result.append(count);


        System.out.println(result);
    }
}