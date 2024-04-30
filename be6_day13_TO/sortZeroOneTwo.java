package be6_day13_TO;

//Time Complexity = O(n)with n: the length of the input string and number 2 at the end

public class sortZeroOneTwo {
	 public static void sort(int[] arr) {
		 int zeroCount = 0;
         int oneCount = 0;
 
         for (int i = 0; i < arr.length; i++) {
              if (arr[i] == 0)
                  zeroCount++;
              if (arr[i] == 1)
                   oneCount++;
         }
         
         for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
         }
         
         for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
            arr[i] = 1;
         }
         
         for (int i = (zeroCount + oneCount); i < arr.length; i++) {
            arr[i] = 2;
         }
   }
 
    public static void main(String[] args) {
 
       int[] arr = {0, 1, 1, 0, 1, 2, 0, 1, 2};
       sort(arr);
 
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }
}
