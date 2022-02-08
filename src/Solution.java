import java.io.*;
import java.lang.Math;


class Result {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String result = null;
        if (s != null) {
            int hour = Integer.parseInt(s.substring(0, 2)) % 12;
            if (s.endsWith("PM")) {
                hour += 12;
            }
            result = String.format("%02d", hour) + s.substring(2, 8);
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
        String s = "07:05:45PM";

        String result = Result.timeConversion(s);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}