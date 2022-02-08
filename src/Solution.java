import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxCount = 0, maxHeight = 0;
        if (!candles.isEmpty()) {
            for (int x : candles) {
                if (x >= maxHeight) {
                    if (maxHeight != x) {
                        maxHeight = x;
                        maxCount = 0;
                    }
                    maxCount++;
                }
            }
        }
        return maxCount;
    }
}

public class Solution {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
        int candlesCount = 10;

//        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
        List<Integer> candles = Stream.of("18 90 90 13 90 75 90 8 90 43".replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.birthdayCakeCandles(candles);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

    }
}
