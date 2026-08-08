import java.util.*;
class Main {
    public static void print(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("* ");
            print(row,col+1);
        }
        if(row==col){
            System.out.println();
            print(row-1,0);
        }
    }
    public static void main(String[] args) {
        print(4,0);
    }
}
