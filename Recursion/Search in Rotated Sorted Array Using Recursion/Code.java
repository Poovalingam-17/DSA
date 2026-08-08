import java.util.*;
class Main {
    public static int rotatedBinarySearch(int []arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target<arr[mid]){
                return rotatedBinarySearch(arr,target,start,mid-1);
            }
            else{
                return rotatedBinarySearch(arr,target,mid+1,end);
            }
        }
        if(target>arr[mid]){
            return rotatedBinarySearch(arr,target,mid+1,end);
        }
        return rotatedBinarySearch(arr,target,start,mid-1);
    }
    public static void main(String[] args) {
        int []arr = {5,6,7,8,1,2,3,4};
        int target = 8;
        System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));
    }
}
