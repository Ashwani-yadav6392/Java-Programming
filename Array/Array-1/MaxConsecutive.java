class MaxConsective {
public static void main(String args []) {
int[] arr = {1,1,0,1,1,1};

System.out.println(getMaxConsective(arr));

}

public static int getMaxConsective(int[] arr) {
int max = 0;
int count=0;
for(int i=0;i<arr.length;i++) {
if(arr[i] == 1) {
count++;
if(count>max) {
max=count;
}
}else{
count = 0;
}
}
return max;
}
}

