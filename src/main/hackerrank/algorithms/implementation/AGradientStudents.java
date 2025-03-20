package main.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class AGradientStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>(grades.size());

        for (Integer grade : grades) {
            if (grade < 37) {
                roundedGrades.add(grade);
                continue;
            }

            double nextMultipleOfFive = Math.ceil((float) grade / 5) * 5;
            if (nextMultipleOfFive - grade  < 3) {
                roundedGrades.add((int) nextMultipleOfFive);
                continue;
            }

            roundedGrades.add(grade);
        }

        return roundedGrades;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);

        System.out.println(result);

        bufferedReader.close();
    }
}
