import java.util.*;
class Main {
    public static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibo(n));
    }
}
