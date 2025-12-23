package main.hackerrank.algorithms.implementation.A;

import java.io.*;

public class KDrawingBook {
    public static int pageCount(int n, int p) {
        int bookPages = 1 + n / 2;

        int page = (int) Math.floor((float) p / 2 + 1);

        if (page > bookPages / 2) {
            return bookPages - page;
        }

        return page - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = pageCount(n, p);
        System.out.println(result);

        bufferedReader.close();
    }
}
