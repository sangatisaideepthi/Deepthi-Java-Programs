import java.util.Arrays;
import java.util.Scanner;
class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // initial size
        int size = 0; // current number of elements
        System.out.print("Enter number of elements: ");
        size = sc.nextInt();
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\nEnter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
        System.out.print("\nEnter element to delete: ");
        int del = sc.nextInt();
        found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == del) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element deleted. Updated array: " + Arrays.toString(Arrays.copyOf(arr, size)));
        } else {
            System.out.println("Element not found to delete.");
        }
        Arrays.sort(arr, 0, size);
        System.out.println("\nSorted Array: " + Arrays.toString(Arrays.copyOf(arr, size)));
        sc.close();
    }
}
