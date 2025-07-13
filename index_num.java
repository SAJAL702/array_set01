public class index_num {
    public static void main(String [] args){
        int[] arr = {22,3,4,12,4,23,6};
        int key = 4;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Index of " + key + " is: " + i);
                return;
            }
        }
    }
}
