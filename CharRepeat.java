import java.util.*;

public class CharRepeat {

    public static String encode(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            // If the next character is the same, increment our tracking counter
            if (i + 1 < text.length() && text.charAt(i) == text.charAt(i + 1)) {
                count++;
            } else {
                // Append the character followed by its total count
                encoded.append(text.charAt(i)).append(count);
                count = 1; // Reset counter for the next character run
            }
        }
        return encoded.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = encode(str);
        System.out.println(res);
    }
}
