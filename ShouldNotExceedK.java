package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class ShouldNotExceedK {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        if (k == 0) {
            System.out.println("0");
        } else {
            Arrays.sort(a);
            int sum = 0;
            for (int i = 0; i < k; i++) {
               
                int value = a[a.length - 1 - i];
                sum += value;
                int index = 1;
                while (true) {

                    if (a.length > a.length - i - 1 - index && value == a[a.length - i - 1 - index]) {
                        sum += a[a.length - i - 1 - index];
                        index++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
