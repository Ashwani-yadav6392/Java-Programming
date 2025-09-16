class TargetOfSum {
public static void main(String args[]) {
int[] arr = {8,10,12,11,20};
int target = 22;
int[] result = twoSum(arr,target);
if (result.length == 0) {
System.out.println("No pair found");
} else {
System.out.println("Indices: " + result[0] + ", " + result[1]);
//System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
        }
}

public static int[] twoSum(int[] arr,int target) {
for(int i=0;i<arr.length - 1;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]+arr[j] == target)

return new int[] {i,j};

}
}

return new int[] {};
}
}