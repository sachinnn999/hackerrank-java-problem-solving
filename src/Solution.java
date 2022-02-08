import java.io.*;
import java.lang.Math;


class Result {
    private static final int constraint = (int) (2 * Math.pow(2, 10));
    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        String result;
        for (int i = 1; i <= n; i++) {
            result = null;
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                if (result == null) {
                    result = "Buzz";
                } else {
                    result += "Buzz";
                }
            }
            if (result == null) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
