package JavaByCoderArmy;

import java.util.Scanner;

public class DutchNationalFlag {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements (0,1,2) separated by comma:");
        String input = sc.nextLine();

        String[] parts = input.split(",");
        int n = parts.length;

        int[] nums = new int[n];

        for (int x = 0; x < n; x++) {
            nums[x] = Integer.parseInt(parts[x].trim());
        }

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {  // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}