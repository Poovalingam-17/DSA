import java.util.*;
class Main {
    public static ArrayList<Integer> findAllIndex(int []arr,int target,int ind){
        ArrayList<Integer> list = new ArrayList<>();
        if(ind==arr.length){
            return list;
        }
        if(arr[ind]==target){
            list.add(ind);
        }
        ArrayList<Integer> ans = findAllIndex(arr,target,ind+1);
        list.addAll(ans);
        return list;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,1,4};
        int target = 1;
        System.out.println(findAllIndex(arr,target,0));
    }
}
