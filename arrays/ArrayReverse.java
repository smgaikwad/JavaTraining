package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array :");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Elements of Array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("original Array is :" + Arrays.toString(a));
        arrayReverse(a, size);
    }

    private static void arrayReverse(int[] a, int size) {
        for (int i = 0, j = size - 1; i <= j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println("Reverse Array is :" + Arrays.toString(a));
    }
}
