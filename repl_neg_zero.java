public class repl_neg_zero {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -3, 4, 6, -5};
        System.out.println("after replacing negative numbers with zero: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
