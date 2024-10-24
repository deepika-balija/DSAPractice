package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAvrgMarks {
    public static void main(String[] args) {
        String[][] input = {{"Charles", "84"},
            {"John", "100"},
            {"Andy", "37"},
            {"John", "23"},
            {"Charles", "20"}};
double result = highestAvrgMarks(input);
        System.out.println(result);
    }
    public static double highestAvrgMarks(String[][] input) {
        Map<String, List<Integer>> studMarks = new HashMap<>();
        String topStud ="";
        double highestAvrgMarks =Double.NEGATIVE_INFINITY;
        for (String[] entry : input) {
            String stuName = entry[0];
            int marks = Integer.parseInt(entry[1]);
            studMarks.putIfAbsent(stuName, new ArrayList<>());
            studMarks.get(stuName).add(marks);
        }
            for(String student: studMarks.keySet()) {
                List<Integer>  marksList= studMarks.get(student);
                int sum=0;
                for(int mark: marksList) {
                    sum+=mark;
                }
                double avrgMarks = (double)sum/marksList.size();
                if(avrgMarks > highestAvrgMarks) {
                    highestAvrgMarks = avrgMarks;
                    topStud = student;
                }
            }

return highestAvrgMarks;
    }
}
