class HalfReverse {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Original array:");
          for(int s:arr){
           System.out.print(" "+s);
               }

        // reverse first half
        reverse(arr, 0, arr.length / 2 - 1);

        // reverse second half
        reverse(arr, arr.length / 2, arr.length - 1);
         System.out.println();
        System.out.print("Reversed array:");
        for(int x:arr){
         System.out.print(" "+x);
        }
    }

    // method to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

   }
