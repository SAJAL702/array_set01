public class copy_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied array elements:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
    
}
