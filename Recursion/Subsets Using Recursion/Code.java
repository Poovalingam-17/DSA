import java.util.*;
class Main {
    public static ArrayList<String> subset(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset(p+ch,up.substring(1));
        ArrayList<String> right = subset(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        System.out.println(subset(p,up));
    }
}
