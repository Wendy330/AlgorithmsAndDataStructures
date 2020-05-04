package chunk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Chunk array with the provided size
public class Solution {
    public static void main(String[] args) {
        chunk(Arrays.asList(1, 2, 3, 4, 5), 3);
    }

    public static void chunk(List<Integer> array, int size) {
        List<List<Integer>> chunked = new ArrayList<>();

        for (int num : array) {
            if (chunked.size() == 0 || chunked.get(chunked.size() - 1).size() == size) {
                chunked.add(new ArrayList<>(Arrays.asList(num)));
            } else {
                chunked.get(chunked.size() - 1).add(num);
            }
        }

        System.out.println(chunked);
    }
}