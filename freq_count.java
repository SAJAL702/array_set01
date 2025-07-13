public class freq_count {
    public static void main(String [] args){
        int[] arr = {1,2,2,3,4,2,5,2,6};
        int num = 2;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println("Frequency of " + num + " in the array: " + count);
    }
    
}
