public class count_even_odd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Count of even numbers: " + even);
        System.out.println("Count of odd numbers: " + odd);
    }
    
}
