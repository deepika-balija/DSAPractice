package com.interview_preparation;

import java.util.*;

public class highestAverageMarks {
    public static void main(String[] args) {
        String[][] input = {{"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}};
        double result = findingHighestAvgMarks(input);
        System.out.println(result); //61.5

    }

    private static double findingHighestAvgMarks(String[][] input) {
        Map<String, List<Integer>> mp = new HashMap<>();
        double highestAvgMarks = Double.NEGATIVE_INFINITY;
        for (String[] entry : input) {
            String studentName = entry[0];
            Integer marks = Integer.parseInt(entry[1]);
            mp.putIfAbsent(studentName, new ArrayList<>());
            mp.get(studentName).add(marks);

        }
        for (String student : mp.keySet()) {

            List<Integer> marksList = mp.get(student);
            int sum = 0;
            for (int mark : marksList) {
                sum += mark;
            }

            double avgMarks = (double) sum / marksList.size();
            if (highestAvgMarks < avgMarks) {
                highestAvgMarks = avgMarks;
            }

        }
        return highestAvgMarks;
    }
}