public class repl_even_one {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("After replacing even numbers with -1");
        for(int i = 0; i< arr.length; i++) {
            if (arr[i] %2 ==0){
                arr[i] = -1;
            }
            System.out.print(arr[i] + " ");
        } 
    }
}
