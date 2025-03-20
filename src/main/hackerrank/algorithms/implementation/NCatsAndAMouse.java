package main.hackerrank.algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class NCatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
        int catAFromMouse = Math.abs(x - z);
        int catBFromMouse = Math.abs(y - z);

        if (catAFromMouse > catBFromMouse) {
            return "Cat B";
        } else if (catAFromMouse < catBFromMouse) {
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }

        scanner.close();
    }
}
