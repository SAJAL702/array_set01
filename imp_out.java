import java.util.*;
public class imp_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {   
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
    
}
