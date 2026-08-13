class Main {
    public static String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }
        String s = "apple";
        if(up.startsWith(s)){
            return skipWord(up.substring(s.length()));
        }
        else{
            return up.charAt(0)+skipWord(up.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skipWord("bacapplecadh"));
    }
}
