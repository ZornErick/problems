package main.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class IBirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int countMaxInteger = 0;

        Integer maxInteger = Collections.max(candles);

        for (Integer candle : candles) {
            if (candle.equals(maxInteger)) {
                countMaxInteger++;
            }
        }

        return countMaxInteger;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        System.out.println(result);

        bufferedReader.close();
    }
}
