class Main {
    public static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char c = up.charAt(0);
        if(c=='a'){
            return skip(up.substring(1));
        }
        else{
            return c+skip(up.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skip("baccadh"));
    }
}
