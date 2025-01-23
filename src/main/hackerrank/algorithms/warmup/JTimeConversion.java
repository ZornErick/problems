package main.hackerrank.algorithms.warmup;

import java.io.*;

public class JTimeConversion {
    public static String timeConversion(String s) {
        String hours = s.substring(0, 2);
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);
        String AMPM = s.substring(8, 10);

        if (AMPM.equals("PM")) {
            hours = String.valueOf(Integer.parseInt(hours) + 12);

            if (hours.equals("24")) {
                hours = "12";
            }
        }

        if (AMPM.equals("AM") && hours.equals("12")) {
            hours = "00";
        }

        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}
