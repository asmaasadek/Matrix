import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hi..");
        String[][] interviewExample = {
                {"1", "A", "5", "7", "B", "N"},
                {"2", "B", "6", "8", "K", "R"},
                {"5", "Q", "N", "3", "B", "1"}
        };
        System.out.println(
                getResult(interviewExample, 3, 6));


    }

    static List<String> getResult(String[][] a, int m, int n) {
        //Base Case
        if (m == 0 || n == 0)
            return Collections.EMPTY_LIST;

        List<String> result = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            StringBuffer item = new StringBuffer();
            for (int i = r, j = 0; j < n && i >= 0; i--, j++) {
                item.append(a[i][j]);
            }
            result.add(item.toString());
        }

        for (int c = 1; c < n; c++) {
            StringBuffer item = new StringBuffer();
            for (int i = m - 1, j = c; j < n && i >= 0; i--, j++) {
                item.append(a[i][j]);
            }
            result.add(item.toString());
        }
        return result;
    }

}
