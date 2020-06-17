package com.dmytrolystovets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            int n = Integer.parseInt(input);
            System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
        }

    }

    public static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < arr[middle]) {
                high = middle - 1;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }

        }

        return -1;

    }


}
