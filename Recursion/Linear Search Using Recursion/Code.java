class Main {
    public static int LinearSearch(int[]arr,int target,int ind){
        if(ind==arr.length){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        else{
            return LinearSearch(arr,target,ind+1);
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println("The Element "+target+" Is Found In Index "+LinearSearch(arr,target,0));
    }
}
