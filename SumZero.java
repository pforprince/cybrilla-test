package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class SumZero {

    public void findTriplets(int arr[], int n) {
        int i, sum = 0;
        Arrays.sort(arr);
        boolean flag = false;
        for (i = 0; i < n - 2; i++) {
            if (i == 0 || arr[i] > arr[i - 1]) {
                int start = i + 1;
                int end = n - 1;
                int target = sum - arr[i];
                while (start < end) {

                    if (start > i + 1 && arr[start] == arr[start - 1]) {
                        start++;
                        continue;
                    }
                    if (end < n - 1 && arr[end] == arr[end + 1]) {
                        end--;
                        continue;
                    }
                    if (target == arr[start] + arr[end]) {
                        System.out.println(arr[i] + "," + arr[start] + "," + arr[end]);
                        flag = true;
                        start++;
                        end--;
                    } else if (target > (arr[start] + arr[end])) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("Not Exists");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        SumZero sumZero = new SumZero();
        sumZero.findTriplets(arr, n);
    }
}
