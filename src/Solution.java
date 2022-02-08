import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> response = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38 || grade % 5 <= 2) {
                response.add(grade);
            } else {
                int add = 5 - (grade % 5);
                response.add(grade + add);
            }
        }
        return response;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> grades = new ArrayList<>();
//        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = Result.gradingStudents(grades);

        System.out.println(result);
    }
}
