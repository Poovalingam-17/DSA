class Main {
    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        if(c=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+c,up.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("","baccadh");
    }
}
