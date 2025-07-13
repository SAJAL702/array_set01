public class min_array {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}
