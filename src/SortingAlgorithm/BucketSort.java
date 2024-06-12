package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
    static void PrintArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void BucketSort(float[] array) {
        int n = array.length;
        if (n <= 0) return;

        // Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add elements to the corresponding buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (array[i] * n);
            if (bucketIndex == n) { // handle edge case when array[i] == 1
                bucketIndex = n - 1;
            }
            buckets[bucketIndex].add(array[i]);
        }

        // Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Merge all buckets to get the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                array[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        float[] array = new float[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextFloat();
        }
        System.out.println("Original array is");
        PrintArray(array);
        System.out.println("Sorted array in increasing order is");
        BucketSort(array);
        PrintArray(array);
    }
}
