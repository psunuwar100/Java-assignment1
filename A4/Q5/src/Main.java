import java.util.Arrays;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,3,4};
        ArrayList<Integer> ans = new ArrayList<>();
        for (int a : num) {
            int i =num[a];
            ans.add(i);
        }
        System.out.println(Arrays.toString(num));
        System.out.println(ans);
    }
}