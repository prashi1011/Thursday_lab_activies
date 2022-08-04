package Prashijavapractice.java;

//a program to rotate array


public class RotateArray {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int n = arr.length;
            int last, i;
            System.out.print("The original array is: ");
            for (i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            last = arr[n-1];
            for (i = n-1; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = last;
            System.out.print("\nThe rotated Array is: ");
            for (i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
        }


}