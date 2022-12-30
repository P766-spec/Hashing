package Questions;
import java.util.HashSet;
// https://www.interviewbit.com/problems/colorful-number/
public class Soultion8 {
    public static void main(String[] args) {
        int A = 23;
        System.out.println(colorful(A));
    }
    static  int colorful(int A) {
        HashSet<Integer> check = new HashSet<Integer>();
        String str = Integer.toString(A);
        for(int i =0; i<str.length(); i++){
            int product = 1;
            for(int j =i;  j< str.length(); j++){
                int num = str.charAt(j) - '0';
                product *= num;
                if(check.contains(product)) return 0;
                check.add(product);
            }
        }
        return 1;
    }

}
