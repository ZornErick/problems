package main.hackerrank.algorithms.implementation.B;

import java.io.IOException;
import java.util.List;

public class ASecurityCities {
    public static int securityCities(List<Integer> populations, String security) {
        int result = 0;

        char[] charArray = security.toCharArray();

        for (int i = 1; i < populations.size(); i++) {
            if (charArray[i - 1] == '0' && charArray[i] == '1') {
                if (populations.get(i - 1) > populations.get(i)) {
                    charArray[i] = '0';
                    charArray[i - 1] = '1';
                } else if (populations.size() - 1 >= i + 1) {
                    if (populations.get(i - 1) > populations.get(i + 1)) {
                        if (charArray[i + 1] == '1') {
                            charArray[i] = '0';
                            charArray[i - 1] = '1';
                        }
                    }
                }
            }
        }

        for (int i = 0; i < populations.size(); i++) {
            if (charArray[i] == '1') {
                result += populations.get(i);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        int result = securityCities(List.of(20, 10, 9, 30, 20, 19), "011011");
        System.out.println(result);
    }
}
