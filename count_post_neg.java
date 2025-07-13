public class count_post_neg {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }

        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
    }
}
