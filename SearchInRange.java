package Searching;

public class SearchInRange {
    public static void main(String[] args) {


    int[]arr={2,3,4,5,12,334,21,31};
    int target=42;
    int start=1;
    int end=4;
        System.out.println( find(arr, target, start, end));
}
static int find(int []arr,int target,int start,int end){

    for (int i = start; i <=end; i++) {
        int element=arr[i];
                   if(target==element){
                       return i;
                   };
    }

        return -1;
}

}
