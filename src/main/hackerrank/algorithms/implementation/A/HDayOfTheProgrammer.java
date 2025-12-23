package main.hackerrank.algorithms.implementation.A;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HDayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        List<Integer> monthDays = new ArrayList<>(List.of(31, 28, 31, 30, 31, 30, 31 ,31));

        if (year >= 1919) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                monthDays.set(1, 29);
            }
        } else if (year <= 1917) {
            if (year % 4 == 0) {
                monthDays.set(1, 29);
            }
        } else {
            monthDays.set(1, 15);
        }

        int dayOfTheProgrammer = 256 - monthDays.stream().mapToInt(Integer::intValue).sum();

        return dayOfTheProgrammer + ".09." + year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);
        System.out.println(result);

        bufferedReader.close();
    }
}
