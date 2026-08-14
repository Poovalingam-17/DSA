import java.util.*;
class Main {
    public static List<List<Integer>> subset(int []arr){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int num : arr){
            int n = res.size();
            for(int i=0;i<n;i++){
                List<Integer> list = new ArrayList<>(res.get(i));
                list.add(num);
                res.add(list);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
    }
}
