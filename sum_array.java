//sum of elements of an array

public class sum_array {
    public static void main(String[] args) {
        int[] arr = {15, 20, 25, 30, 35};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
