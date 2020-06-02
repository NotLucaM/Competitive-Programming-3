package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {

    public boolean problem1(int[] S) {
        Set<Integer> set = new HashSet<>();
        for (int i : S) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean problem2(int[] S, int v) {
        Arrays.sort(S);

        for (int i = 0; i < S.length; i++) {
            if (Arrays.binarySearch(S, v - S[i]) > 0 && Arrays.binarySearch(S, v - S[i]) != i) {
                return true;
            }
        }
        return false;
    }

    public int[] problem4(int[] S, int a, int b) {
        int count = 1;

        // doing this in order to find the size of the array
        int last = S[a];
        for (int i = a + 1; i <= b; i++) {
            if (last <= S[i]) {
                count++;
                last = S[i];
            }
        }

        // redoing this in order to fill the array
        int[] ordered = new int[count];
        count = 1;
        last = S[a];
        ordered[0] = S[a];
        for (int i = a + 1; i <= b; i++) {
            if (last <= S[i]) {
                ordered[count] = S[i];
                count++;
                last = S[i];
            }
        }

        return ordered;
    }

    public int problem5(int[] S) {
        int longest = 0;
        int current = 0;
        int last = Integer.MAX_VALUE;

        for (int i : S) {
            if (last < i) {
                current++;
            } else {
                current = 1;
            }
            last = i;
            if (current > longest) {
                longest = current;
            }
        }

        return longest;
    }
}
