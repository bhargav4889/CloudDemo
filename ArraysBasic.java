public class ArraysBasic {
    // binary 

    public static void main(String[] args) {
        int[] arr = {2,4,5,6};

        // int ans = Arrays.binarySearch(arr,2);
    
    
        System.out.println(FindIndex(arr,2)); 

    }


    // method  find the index 

    static int FindIndex(int[] arr,int num){  // array pass
       for(int k = 0; k < arr.length - 1; k++){ // loop start
            if(arr[k] == num){  // check 
                return k; // index return 
            }
       }

       return -1; // nothing then return -1
    }


    // Duplicate Array Logic 
    

}
